package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity3 {
  
	WebDriver driver;
	@BeforeMethod
	public void beforeMethod()
	{
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");
				
	}
  @Test
  public void testcase3()
  {
	  //WebElement heading = driver.findElement(By.xpath("//*[contains(@class,'entry-title')]"));
	  WebElement image = driver.findElement(By.xpath("//img[1]"));
	  String src = image.getAttribute("src");
	  System.out.println("URL of the image: "+ src);
  }
  
  @AfterMethod
  public void aftermethod()
  {
	  driver.close();
  }
}
