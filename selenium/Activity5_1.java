package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls ");
		
		WebElement checkboxInput = driver.findElement(By.xpath("//input[@type='checkbox']"));
		System.out.println("the checkbox input is: "+ checkboxInput.isDisplayed() );
		
		driver.findElement(By.xpath("//button[@id='toggleCheckbox']")).click();
		System.out.println("the checkbox input is: "+checkboxInput.isDisplayed() );
		
		driver.close();
		

	}

}
