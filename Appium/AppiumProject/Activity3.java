package Appiumproject;



import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class Activity3 {
	
	AppiumDriver<MobileElement> driver = null;
	WebDriverWait wait;

	@BeforeClass
	public void beforeClass() throws MalformedURLException
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Pixel 4 Pie");
		caps.setCapability("platformName", "Android");
		caps.setCapability("appPacakge", "com.google.android.keep");
		caps.setCapability("appActivity", ".activities.BrowseActivity");
		caps.setCapability("noReset", true);

		URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(appServer, caps);
		wait = new WebDriverWait(driver, 20);
	}
	@Test
	public void googleNote()
	{
		driver.findElementByAccessibilityId("New text note").click();
		driver.findElementById("com.google.android.keep:id/editable_title").sendKeys("Reminder");
		driver.findElementById("com.google.android.keep:id/edit_note_text").sendKeys("Activity3");
		
		// to click on reminder		
		driver.findElementByAccessibilityId("Reminder").click();
		
		driver.findElementByXPath("//android.support.v7.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]").click();
		//wait.until(ExpectedConditions.elementToBeClickable(By.id("com.google.android.keep:id/save")));		
		//to click on save		
		//driver.findElementById("com.google.android.keep:id/save").click();
		//to click on back button
		driver.findElementByAccessibilityId("Open navigation drawer").click();
		
		driver.findElementByAccessibilityId("Open navigation drawer").click();
		
		//to click on reminders
		driver.findElementById("com.google.android.keep:id/drawer_navigation_reminders").click();
		
		String title = driver.findElementById("com.google.android.keep:id/index_note_title").getText();
		Assert.assertEquals(title, "Reminder");
		System.out.println(title);
		
		String description = driver.findElementById("com.google.android.keep:id/index_note_text_description").getText();
		Assert.assertEquals(description, "Activity3");
		System.out.println(description);
		
		String time = driver.findElementById("com.google.android.keep:id/reminder_chip_text").getText();
		Assert.assertEquals(time, "Today, 6:00 PM");
		System.out.println(time);
		
		//to verify reminder is displayed or not
		//driver.findElementById("com.google.android.keep:id/reminder_chip_text").isDisplayed();
				
		
	}

}
