package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver =  new FirefoxDriver();
		driver.get(" https://www.training-support.net/selenium/simple-form");
		String title = driver.getTitle();
		System.out.println("Title of the web page is: "+ title);
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Spandana");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Javvaji");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@id='number']")).sendKeys("4312345765");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.switchTo().alert().accept();
		driver.close();
	}

}
