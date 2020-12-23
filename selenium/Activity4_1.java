package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1  {

    public static void main(String[] args) {

        
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.training-support.net");
        String title = driver.getTitle();
        System.out.println("title is: "+ title);
        driver.findElement(By.xpath("//a[@id='about-link']")).click();
        System.out.println("heading is: "+ title);
        driver.close();


    }

}
