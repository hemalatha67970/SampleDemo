package org.base;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

public	static WebDriver driver;
	public static void openChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	}
	
	public static void launchUrl(String url) {
		driver.get(url);

	}
	
	public static void toFetchCurrentUrl(String currentUrl) {
		String currenturl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	
	public static void toFetchTitle() {
		String title1 = driver.getTitle();
		System.out.println(title1);
	}
	
	public static void quit() {
		driver.quit();;

	}
	
	public static void close() {
		driver.close();

	}
	
	public static void forward() {
		driver.navigate().forward();

	}
	public static void back() {
		driver.navigate().back();

	}
	
	public static void toUrl(String url) {
		driver.navigate().to(url);

	}	
	public static void refresh() {
		driver.navigate().refresh();

	}

	public static void holdTime(int millis) throws InterruptedException {
		Thread.sleep(millis);

	}

	public static void implicitWait(int s) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(s));

	}
	
	public static void maxWindow() {
	driver.manage().window().maximize();
	}
	public static void fillTextBox(WebElement element, String value) {
	element.sendKeys(value);
		}
	public static void click(WebElement element) {
		element.click();
		}
	public static void getText(WebElement element) {
		String txt = element.getText();
		System.out.println(txt);
		}	
	public static void getAttribute(WebElement element, String value) {
		String txt = element.getAttribute(value);
		System.out.println(txt);
		}
	public static void windowHandles(int i) {
		String parentId = driver.getWindowHandle();
		Set<String> allwindows = driver.getWindowHandles();
		List<String> li= new ArrayList<String>();
		
		driver.switchTo().window(li.get(i));
		
	}
}
