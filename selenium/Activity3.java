package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new FirefoxDriver();
		    
	        //Open the browser
	        driver.get("https://www.training-support.net/selenium/simple-form");
	        
	        //Find the page title and print it
	        String pageTitle = driver.getTitle();
	        System.out.println(pageTitle);
	        
	        //Find the input fields
	        WebElement firstName = driver.findElement(By.id("firstName"));
	        WebElement lastName = driver.findElement(By.id("lastName"));
	        //Enter text
	        firstName.sendKeys("spandana");
	        lastName.sendKeys("asdf");
	        
	        //Enter the email
	        driver.findElement(By.id("email")).sendKeys("anckdmc@gmail.com");
	        
	        //Enter the contact number
	        driver.findElement(By.id("number")).sendKeys("3248909873");
	        
	        //Click Submit
	        driver.findElement(By.cssSelector(".ui.green.button")).click();
	    
	        //Close the browser
	        driver.close();

	}

}
