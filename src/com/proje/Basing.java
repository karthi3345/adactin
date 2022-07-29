package com.proje;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basing {

	public static WebDriver driver;

	public static WebDriver getBrowser(String BrowserName) {
		 
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\lkart\\eclipse-workspace\\Project1\\Driver\\chromedriver.exe")	;
	return driver= new ChromeDriver();
	}
	public static void getUrl(String url){
		driver.get(url);
		}

	public static void click(WebElement element) {
	element.click();	
	}

	public static void sendKeys(WebElement element, String value ) {
		element.sendKeys(value);
		}
	public static void defaultcontent() {
		driver.switchTo().defaultContent();
	}
public static void Frame(int i) {
	
		driver.switchTo().frame(i);
		
	}
	public static void Wait() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}


}



}
