package Appiumproject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity1 {

	AppiumDriver<MobileElement> driver = null;
	WebDriverWait wait;

	@BeforeClass
	public void beforeClass() throws MalformedURLException
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Pixel 4 Pie");
		caps.setCapability("platformName", "Android");
		caps.setCapability("appPacakge", "com.google.android.apps.tasks");
		caps.setCapability("appActivity", ".ui.TaskListsActivity");
		caps.setCapability("noReset", true);

		URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(appServer, caps);
		wait = new WebDriverWait(driver, 20);
	}

	@Test
	public void GoogleTasks() throws InterruptedException
	{
		driver.findElementById("com.google.android.apps.tasks:id/tasks_fab").click();		

		//Thread.sleep(10000);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.google.android.apps.tasks:id/add_task_title")));

		//firstTask
		MobileElement firstTask = driver.findElementById("com.google.android.apps.tasks:id/add_task_title");
		firstTask.sendKeys("Complete Activity with Google Tasks");
		driver.findElementById("com.google.android.apps.tasks:id/add_task_done").click();		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.google.android.apps.tasks:id/tasks_fab")));
		
		
		//secondTask
		//driver.findElementByAccessibilityId("Create new task").click();
		driver.findElementById("com.google.android.apps.tasks:id/tasks_fab").click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.google.android.apps.tasks:id/add_task_title")));
		MobileElement secondTask = driver.findElementById("com.google.android.apps.tasks:id/add_task_title");
		secondTask.sendKeys("Complete Activity with Google Keep");
		driver.findElementById("com.google.android.apps.tasks:id/add_task_done").click();

		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.google.android.apps.tasks:id/tasks_fab")));

		//thirdTask
		//driver.findElementByAccessibilityId("Create new task").click();
		driver.findElementById("com.google.android.apps.tasks:id/tasks_fab").click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.google.android.apps.tasks:id/add_task_title")));
		MobileElement thirdTask = driver.findElementById("com.google.android.apps.tasks:id/add_task_title");
		thirdTask.sendKeys("Complete the second Activity Google Keep");
		
		
		driver.findElementById("com.google.android.apps.tasks:id/add_task_done").click();

		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.google.android.apps.tasks:id/task_name")));
		List<MobileElement> tasklist = driver.findElementsById("com.google.android.apps.tasks:id/task_name");
		for (MobileElement tlist : tasklist) {
			System.out.println("The task name is :" + tlist.getText());
		
		// To Check all tasks are added to list 
		Assert.assertEquals(tasklist.size(), 3);
		Assert.assertEquals(tasklist.get(0).getText(), "Complete the second Activity Google Keep");
		Assert.assertEquals(tasklist.get(1).getText(), "Complete Activity with Google Keep");
		Assert.assertEquals(tasklist.get(2).getText(), "Complete Activity with Google Tasks");
		}
		
		
	}
	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
