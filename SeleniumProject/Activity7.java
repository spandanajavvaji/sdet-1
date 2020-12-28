package SeleniumProject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test; 



public class Activity7 {
	WebDriver driver;
	@BeforeMethod
	public void beforeMethod()
	{
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");

	}
	@Test
	public void testcase7() throws InterruptedException 
	{


		driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/jobs/post-a-job/']")).click();

		driver.findElement(By.id("create_account_email")).sendKeys("abc.123415@gmail.com");

		driver.findElement(By.xpath("//input[@id='job_title']")).sendKeys("Test Specialist");

		Select JobType = new Select(driver.findElement(By.name("job_type")));
		JobType .selectByVisibleText("Full Time");

		//Frames class
		driver.switchTo().frame(0);
		driver.findElement(By.id("tinymce")).sendKeys("Test");
		driver.switchTo().defaultContent();
		//Switch to parent class
		driver.switchTo().defaultContent();

		driver.findElement(By.id("application")).sendKeys("abc.123415@gmail.com");
		driver.findElement(By.id("company_name")).sendKeys("Testing Pvt Ltd");
		driver.findElement(By.name("submit_job")).click();

		//driver.findElement(By.xpath("//input[@value='Preview']")).click();

		driver.findElement(By.id("job_preview_submit_button")).click();
		
		System.out.println(driver.findElement(By.xpath(".//div[contains(@class, 'entry-content')]")).getText());
		driver.findElement(By.xpath(".//div[contains(@class, 'entry-content')]/a[contains(text(), 'click here')]")).click();




	}

	@AfterMethod
	public void aftermethod()
	{
		driver.close();
	}
}
