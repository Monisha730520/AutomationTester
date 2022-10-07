		
package org.runner;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import org.openqa.selenium.remote.server.handler.interactions.touch.Scroll;
import org.openqa.selenium.support.ui.Wait;

public class StartTour extends BaseClass {
	public static void main(String[] args) throws InterruptedException, AWTException {
		browsers("Chrome");
		urlLaunch("https://dev-platform-tour.kavida.ai/kavida/start-tour");
		impWait(20);
		
		WebElement UserText = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		UserText.sendKeys("Monisha");
	    Thread.sleep(2000);
	    
		WebElement email = driver.findElement(By.xpath("(//input[@type='email'])"));
		email.sendKeys("test@kavida.ai");
		WebElement jobtitle = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		jobtitle.sendKeys("AutomationTester");
		WebElement click = driver.findElement(By.xpath("//button[@type='button']"));
		click.click();
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
		Thread.sleep(3000);
		WebElement Continue = driver.findElement(By.xpath("//span[text()='Continue']"));
		Continue.click();
		Thread.sleep(3000);
		WebElement Readmore = driver.findElement(By.xpath("(//u[text()='Read more'])[1]"));
		Readmore.click();
		Thread.sleep(2000);
		WebElement Order = driver.findElement(By.xpath("//span[text()='Order Timeline']"));
		Order.click();
		Thread.sleep(2000);
		WebElement Quality = driver.findElement(By.xpath("//p[text()='Quality Assurance ']"));
		Quality.click();
		Thread.sleep(2000);
		WebElement Communication = driver.findElement(By.xpath("//span[text()='Communication Hub']"));
		Communication.click();
		Thread.sleep(2000);
		WebElement Compose = driver.findElement(By.xpath("//span[text()='Compose Email']"));
		Compose.click();
		Thread.sleep(3000);
		WebElement Send = driver.findElement(By.xpath("//span[text()='Send Email']"));
		Send.click();
		Thread.sleep(3000);
		WebElement num = driver.findElement(By.xpath("//u[text()='129347128937']"));
		Thread.sleep(2000);
		doubleClickAction(num);
		
		Thread.sleep(3000);
		WebElement clicktimeline = driver.findElement(By.xpath("//span[text()='Order Timeline']"));
		clicktimeline.click();
		Thread.sleep(3000);
	    WebElement SelectAction = driver.findElement(By.xpath("//span[text()='Select Action']"));
		SelectAction.click();
		WebElement tracking = driver.findElement(By.xpath("(//li[@role='menuitem'])[1]"));
		tracking.click();
		WebElement VesselNumberEnter = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		VesselNumberEnter.click();
		paste();
		Thread.sleep(3000);
		WebElement Submit = driver.findElement(By.xpath("//span[text()='Submit']"));
		Submit.click();
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

	private static void MouseMoveToLocation(WebElement num) {
		// TODO Auto-generated method stub
		
	}
}
