package org.samp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.base.BaseClass;
import org.locators.FlipPojo1;
import org.locators.FlipPojo2;
import org.locators.FlipPojo3;
import org.locators.FlipPojo4;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo extends BaseClass {
 public	static WebDriver driver;
@BeforeClass()	
public static void tc1() {
	openChromeBrowser();
     launchUrl("https://7904211399:bestlife@97@www.flipkart.com/");
	maxWindow();
	implicitWait(30);
	}
	
@Test()	
	private void tc2() throws AWTException {
	
		FlipPojo1 fp1= new FlipPojo1();
		WebElement email = fp1.getTxtuser();
		fillTextBox(email, "7904211399");	
		WebElement pass = fp1.getPassword();
		fillTextBox(pass, "bestlife@97");
		
		WebElement btnlogin = fp1.getBtnlogin();
		click(btnlogin);
		
		
}
@Test()

private void tc3() throws AWTException {
	
	FlipPojo1 fp1= new FlipPojo1();
	WebElement sb = fp1.getSearchbox();
	sb.sendKeys("iphone");	
WebElement scbtn = fp1.getSearchbtn();
scbtn.submit();

}
@Test()
private void tc4() throws InterruptedException {
	
	FlipPojo3 fp3= new FlipPojo3();
	WebElement iphone11 = fp3.getIphonepro();
	
try {
	
	iphone11.click();
} catch (StaleElementReferenceException e) {
    iphone11 = fp3.getIphonepro();
	iphone11.click();

}
		
		
			
			
}
}




