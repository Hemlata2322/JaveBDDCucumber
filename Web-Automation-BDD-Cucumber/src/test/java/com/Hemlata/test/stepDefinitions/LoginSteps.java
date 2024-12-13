package com.Hemlata.test.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	
	WebDriver driver;
	@Given("User navigates to login page")
	public void User_navigates_to_login_page()
	{
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--headless");
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.thetestingworld.com/testings/");		
	}	
	@And("User switches to Login tab")
	public void User_switches_to_Login_tab()
	{
		driver.findElement(By.xpath("//input[@id = 'tab2']//parent::li")).click();
	}
	
    @When("User enters valid username and password")
    public void User_enters_valid_username_and_password()
    {
    	driver.findElement(By.cssSelector("[name='_txtUserName']")).sendKeys("Hems");
    	driver.findElement(By.cssSelector("[name='_txtPassword']")).sendKeys("HemsPassword");
    }
    @And("User clicks on login button")
    public void User_clicks_on_login_button()
    {
    	driver.findElement(By.cssSelector("[value= 'Login']")).click();
    }
    @Then("User is redirected to the home page")
    public void User_is_redirected_to_the_home_page()
    {
    	Assert.assertTrue(driver.findElement(By.xpath("//a[text() = 'logout']")).isDisplayed());
    	
    }
 //   @And("Check the title of home page to confirm successful login")
  //  public void Check_the_title_of_home_page_to_confirm_successful_login()
  //  {
    	
  //  }

}
