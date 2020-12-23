package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		//WebDriverWait wait = new WebDriverWait(driver,10);
		
		driver.get(" https://training-support.net/selenium/dynamic-attributes");
		driver.getTitle();
		
		driver.findElement(By.xpath("//input[starts-with(@class,'username')]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[starts-with(@class,'password')]")).sendKeys("password");
		
		driver.findElement(By.xpath("//button[contains(text(), 'Log in')]")).click();
		
		String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message: " + loginMessage);
        
        driver.close();
        
		

	}

}
