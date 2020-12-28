package SeleniumProject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity5 {
	WebDriver driver;
	@BeforeMethod
	public void beforeMethod()
	{
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");
				
	}
  @Test
  public void testcase5() throws InterruptedException
  {
	 Thread.sleep(1000);
	 
	 driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/jobs/jobs/']")).click();
	  
	  String title = driver.getTitle();
	  
	  System.out.println("Title of the page is: "+ title);  
	  
	  Assert.assertEquals("Jobs – Alchemy Jobs", title);
	  
  }
  
  @AfterMethod
  public void aftermethod()
  {
	  driver.close();
  }
}
