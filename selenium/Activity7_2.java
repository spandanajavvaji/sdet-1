package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        
       
        driver.get("https://www.training-support.net/selenium/dynamic-attributes");
        System.out.println("title of the page: "+ driver.getTitle());        
        
        
        driver.findElement(By.xpath("//input[contains(@class, '-username')]")).sendKeys("User");
        driver.findElement(By.xpath("//input[contains(@class, '-password')]")).sendKeys("password");
        driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following::input")).sendKeys("password");
        driver.findElement(By.xpath("//input[contains(@class, 'email')]")).sendKeys("abc@gmail.com");
        
        
        driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]")).click();
        
        //Print login message
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message: " + loginMessage);
        
        //Close browser
        driver.close();

    }
}