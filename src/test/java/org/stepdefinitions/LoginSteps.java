package org.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	static WebDriver driver;
	@Given("The user should be in kavida login page")
	public void the_user_should_be_in_kavida_login_page() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://dev-platform-tour.kavida.ai/kavida/start-tour");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("The user should enter firstname, email and jobtitle")
	public void the_user_should_enter_firstname_email_and_jobtitle() {
		
		WebElement userName = driver.findElement(By.xpath("//input[@placeholder='First Name, Last Name']"));
		userName.sendKeys("Monisha");
		
		WebElement txtEmail = driver.findElement(By.xpath("//input[@placeholder='name@company.com']"));
		txtEmail.sendKeys("test@kavida.ai");
		
		WebElement txtJob = driver.findElement(By.xpath("//input[@placeholder='Merchandiser']"));
		txtJob.sendKeys("AutomationTester");
	}

	@When("The user should click the start tour button")
	public void the_user_should_click_the_start_tour_button() {
	   
		WebElement click = driver.findElement(By.xpath("//button[@type='button']"));
		click.click();
	}

	@Then("The user should be in valid page")
	public void the_user_should_be_in_valid_page() throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertTrue("Verify Url",driver.getCurrentUrl().contains("kavida"));
		driver.quit();
	   
	}

}
