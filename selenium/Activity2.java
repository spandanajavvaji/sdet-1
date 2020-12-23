package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		
		driver.get(" https://www.training-support.net");
		String title = driver.getTitle();
		System.out.println("title is of web page is: "+ title);
		
		WebElement idLocator = driver.findElement(By.id("about-link"));
		System.out.println("text in the element is: "+ idLocator);
		
		WebElement classnameLocator = driver.findElement(By.className("green"));
		System.out.println("text in the element is: "+ classnameLocator);
		
		WebElement linkTextLocator = driver.findElement(By.linkText("About Us"));
        System.out.println("Text in element: " + linkTextLocator.getText());
        
        WebElement cssLocator = driver.findElement(By.cssSelector(".green"));
        System.out.println("Text in element: " + cssLocator.getText());
        
        driver.close();
	}

}
