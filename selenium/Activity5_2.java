package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls ");
		System.out.println("Title of the page is: "+ driver.getTitle());
		
		WebElement checkboxInput = driver.findElement(By.xpath("//input[@type='checkbox']"));
		System.out.println("the checkbox is selected: "+ checkboxInput.isSelected());
		
		checkboxInput.click();
		
		System.out.println("the checkbox is selected: "+checkboxInput.isSelected() );
		
		driver.close();

	}

}
