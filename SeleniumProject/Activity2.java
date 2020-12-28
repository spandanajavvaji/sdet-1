package SeleniumProject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity2 {
	WebDriver driver;
	@BeforeMethod
	public void beforeMethod()
	{
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");
				
	}
  @Test
  public void testcase2()
  {
	  //WebElement heading = driver.findElement(By.xpath("//*[contains(@class,'entry-title')]"));
	  String heading = driver.findElement(By.xpath("//*[contains(@class,'entry-title')]")).getText();
	  System.out.println("Heading of the page: "+ heading);
	  Assert.assertEquals("Welcome to Alchemy Jobs", heading);
  }
  
  @AfterMethod
  public void aftermethod()
  {
	  driver.close();
  }
}
