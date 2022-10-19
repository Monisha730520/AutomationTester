package org.stepdefinitions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.runner.BaseClass;


import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps extends BaseClass  {
	static WebDriver driver;
	@Given("The user should be in kavida login page")
	public void the_user_should_be_in_kavida_login_page() {
//		browsers("Chrome");
//		urlLaunch("https://dev-platform-tour.kavida.ai/kavida/start-tour");
//		impWait(20);
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://dev-platform-tour.kavida.ai/kavida/start-tour");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("The user should enter firstname, email and jobtitle")
	public void the_user_should_enter_firstname_email_and_jobtitle() throws InterruptedException {
		
		Thread.sleep(2000);
		WebElement userName = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
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
	@When("The user open the Control Tower Action")
	public void the_user_open_the_Control_Tower_Action() throws InterruptedException {
		Thread.sleep(3000);
		WebElement click1 = driver.findElement(By.xpath("//span[text()='Begin Tour']"));
		click1.click();
		Thread.sleep(3000);
		WebElement click2 = driver.findElement(By.xpath("//span[text()='Continue']"));
		click2.click();
		Thread.sleep(3000);
		WebElement pending = driver.findElement(By.xpath("(//div[@class='MuiCardContent-root'])[2]"));
		pending.click();
		Thread.sleep(3000);
//		WebElement Select = driver.findElement(By.xpath("//select[@class='jss80']"));
		WebElement Ex = driver.findElement(By.xpath("//option[text()='Ex Mill Date']"));
		Ex.click();
		Thread.sleep(3000);
		Thread.sleep(3000);
		WebElement Notisfication = driver.findElement(By.xpath("//span[@class='MuiBadge-root']"));
		Notisfication.click();
		Thread.sleep(3000);
		WebElement Supplier = driver.findElement(By.xpath("//span[text()='Supplier Location Risk for ']"));
		Supplier.click();
	   
	}

	@Then("The user should see the Threats & Alert")
	public void the_user_should_see_the_Threats_Alert() throws InterruptedException {
		Thread.sleep(3000);
		WebElement Continue = driver.findElement(By.xpath("//span[text()='Continue']"));
		Continue.click();
		Thread.sleep(3000);
		WebElement Readmore = driver.findElement(By.xpath("(//u[text()='Read more'])[1]"));
		Readmore.click();
		
	    
	}

	@Then("The user click the Order TimeLine Action")
	public void the_user_click_the_Order_TimeLine_Action() throws InterruptedException {
		Thread.sleep(2000);
		
		WebElement Order = driver.findElement(By.xpath("//span[text()='Order Timeline']"));
		Order.click();
		Thread.sleep(2000);
		WebElement Quality = driver.findElement(By.xpath("//p[text()='Quality Assurance ']"));
		Quality.click();
	   
	}

	@Then("The user click the Communication Hub")
	public void the_user_click_the_Communication_Hub() throws InterruptedException {
		Thread.sleep(2000);
		WebElement Communication = driver.findElement(By.xpath("//span[text()='Communication Hub']"));
		Communication.click();
	   
	}

	@When("Click the Compose an Email")
	public void click_the_Compose_an_Email() throws InterruptedException {
		Thread.sleep(2000);
		WebElement Compose = driver.findElement(By.xpath("//span[text()='Compose Email']"));
		Compose.click();
		Thread.sleep(3000);
		WebElement Send = driver.findElement(By.xpath("//span[text()='Send Email']"));
		Send.click();
	
		Thread.sleep(2000);
		WebElement num = driver.findElement(By.xpath("//div[text()='Click Tracking ID to copy']"));
		num.click();
		
		Thread.sleep(2000);
		WebElement clicktimeline = driver.findElement(By.xpath("//span[text()='Order Timeline']"));
		clicktimeline.click();
		
		
	  
	}

	@Then("The user should The Add Shipping Information")
	public void the_user_should_The_Add_Shipping_Information() throws InterruptedException {
		
		
		Thread.sleep(3000);
	    WebElement SelectAction = driver.findElement(By.xpath("//span[text()='Select Action']"));
		SelectAction.click();
		WebElement tracking = driver.findElement(By.xpath("(//li[@role='menuitem'])[1]"));
		tracking.click();
	   
	}

	@When("The user  Enter Vessel Tracking Id")
	public void the_user_Enter_Vessel_Tracking_Id() throws InterruptedException, AWTException {
		WebElement VesselNumberEnter = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		VesselNumberEnter.click();
		Robot  r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		WebElement Submit = driver.findElement(By.xpath("//span[text()='Submit']"));
		Submit.click();
	   
	}

	@When("The user click the Global Risks")
	public void the_user_click_the_Global_Risks() throws InterruptedException {
		WebElement GlobalRisk = driver.findElement(By.xpath("//span[text()='Global Risks']"));
		GlobalRisk.click();
		Thread.sleep(2000);
		WebElement ContinueNext = driver.findElement(By.xpath("//span[text()='Continue']"));
		ContinueNext.click();
		Thread.sleep(2000);
		WebElement continueNext1 = driver.findElement(By.xpath("//span[text()='Continue']"));
		continueNext1.click();
		WebElement Continueagain = driver.findElement(By.xpath("//span[text()='Continue']"));
		Continueagain.click();
		Thread.sleep(2000);
		WebElement Continueagain1 = driver.findElement(By.xpath("//span[text()='Continue']"));
		Continueagain1.click();
		WebElement Continueagain2 = driver.findElement(By.xpath("//span[text()='Continue']"));
		Continueagain2.click();
		
	    
	}

	@Then("The user should be in valid page")
	public void the_user_should_be_in_valid_page() throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertTrue("Verify Url",driver.getCurrentUrl().contains("kavida"));
		driver.quit();
	   
	}

}
