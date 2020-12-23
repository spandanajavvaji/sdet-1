package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get(" https://www.training-support.net/selenium/target-practice");
		System.out.println("Title of the page is: "+ driver.getTitle());
		
		
		String thridheader = driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
		System.out.println("Third Header is: "+ thridheader);
		
		String fifthheader = driver.findElement(By.xpath("//h5")).getCssValue("color");
		System.out.println("color of the fifth header is "+ fifthheader);
		
		String violetButtonClasses = driver.findElement(By.xpath("//button[contains(text(), 'Violet')]")).getAttribute("class");
		System.out.println("Voilet button classes are: "+ violetButtonClasses);
		
		String GreybuttonClasses = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
		System.out.println("Grey button classes are: "+ GreybuttonClasses );
		
		driver.close();		
		
		

	}

}
