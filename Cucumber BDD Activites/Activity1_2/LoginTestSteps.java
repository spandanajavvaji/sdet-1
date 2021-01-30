package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTestSteps {
	
	WebDriver driver;
    WebDriverWait wait;
    

	@Given("^User is on Login page$")
	public void UserisonLoginPage() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, 15);
		driver.get("https://www.training-support.net/selenium/login-form");				
	}
	
	@When("^User enters username and password$")
	public void EnterUsernameandPassword()
	{
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
				
	}
	@Then("^Read the page title and confirmation message$")
	public void PageTitle() {
		String pageTitle = driver.getTitle();
		String confirmMessage = driver.findElement(By.id("action-confirmation")).getText();
		
		System.out.println("title of the page: "+ pageTitle);
		System.out.println("login message is: "+ confirmMessage);
		
		
	}
	@And("^Close the Browser$")
	public void Close()
	{
		driver.close();
	}
}
