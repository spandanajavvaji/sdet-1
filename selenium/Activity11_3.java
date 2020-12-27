package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		System.out.println("Title of the page is: "+ driver.getTitle());
		
		driver.findElement(By.xpath("//button[@id='prompt']")).click();
		
		Alert PromptAlert = driver.switchTo().alert();
		String Alerttext = PromptAlert.getText();
		System.out.println("Alert text is: "+ Alerttext);
		PromptAlert.sendKeys("Yes, you are!");
		
		PromptAlert.accept();
		
		driver.close();

	}

}
