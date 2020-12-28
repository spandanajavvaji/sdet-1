package SeleniumProject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity4 {
	WebDriver driver;
	@BeforeMethod
	public void beforeMethod()
	{
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");
				
	}
  @Test
  public void testcase4()
  {
	  //WebElement heading = driver.findElement(By.xpath("//*[contains(@class,'entry-title')]"));
	  String title = driver.findElement(By.xpath("//div[@class='entry-content clear']//following::h2")).getText();
	  Assert.assertEquals("Quia quis non", title);
	  System.out.println("second heading of the page is: "+ title);
  }
  
  @AfterMethod
  public void aftermethod()
  {
	  driver.close();
  }
}


