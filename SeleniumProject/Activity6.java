package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity6 {
	WebDriver driver;
	@BeforeMethod
	public void beforeMethod()
	{
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");

	}
	@Test
	public void testcase6() throws InterruptedException 
	{
		//to click on the jobs 
		driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/jobs/jobs/']")).click();

		//to search the keyword in search location
		driver.findElement(By.xpath("//input[@name='search_keywords']")).sendKeys("test Specialist");
		
		driver.findElement(By.xpath("//input[@value='Search Jobs']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='position']")).click();
		
		//to click on the button
		driver.findElement(By.xpath("//input[@type='button']")).click();
		
		//to print the email to the console
		String email = driver.findElement(By.xpath("//a[@class='job_application_email']")).getText();
		System.out.println("email of the Applicant is: "+ email);


	}

	@AfterMethod
	public void aftermethod()
	{
		driver.close();
	}
}
