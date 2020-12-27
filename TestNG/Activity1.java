package TestNGActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {
	
	WebDriver driver;
	@BeforeMethod
	public void beforemethod()
	{
		driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
	}
  @Test
  public void testcase1() 
  {
	  String title = driver.getTitle();
	  System.out.println("Title of the page is:"+title);
	  Assert.assertEquals("Training Support", title);
	  
	  driver.findElement(By.xpath("//a[@id='about-link']")).click();
	  
	  String title1 = driver.getTitle();
	  System.out.println("Page title is:"+ title1);
	  
	  Assert.assertEquals("About Training Support", title1);
  }
  
  @AfterMethod
  public void afterMethod()
  {
	  driver.close();
  }
}
