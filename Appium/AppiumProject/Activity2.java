package Appiumproject;



import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class Activity2 {
	
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
		driver.findElementById("com.google.android.keep:id/editable_title").sendKeys("Appium");
		driver.findElementById("com.google.android.keep:id/edit_note_text").sendKeys("Activity2");
		driver.findElementByAccessibilityId("Open navigation drawer").click();
		
		String title = driver.findElementById("com.google.android.keep:id/index_note_title").getText();
		System.out.println(title);
		
		String description = driver.findElementById("com.google.android.keep:id/index_note_text_description").getText();
		System.out.println(description);
		Assert.assertEquals(title, "Appium");
		Assert.assertEquals(description, "Activity2");
	}
	
	@AfterClass
	public void afterClass()
	{
		driver.quit();
	}

}
