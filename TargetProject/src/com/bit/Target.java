package com.bit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Target {
	
	ChromeDriver d; 
	
	public void Woo() {
		
	}
	
	public void open() {
		System.setProperty("webdriver.gecko.driver", "/Users/ihalder/Downloads/chromedriver_mac64/geckodriver");
		//it will open a blank browser
		d = new ChromeDriver();
		d.get("https://www.walmart.com/");
	}
	
	public void openFirefox() {
		System.setProperty("webdriver.ge.driver", "/Users/ihalder/Downloads/");
		//it will open a blank browser
		d = new ChromeDriver();
		d.get("https://www.walmart.com/");
	}
	
	public void goToAnyWebsite(String url) {
		d.get(url);
	}
	
	public void close() {
		d.quit();
	}
	public void clickElement(By locator) {
		
		d.findElement(locator).click();
	}
	
	public void clickElementbyXpath(String xpathValue) {
		
		d.findElement(By.xpath(xpathValue)).click();
		
	}
	
	public void typeOnAnyElement(String name, By locator) {
		
		d.findElement(locator).sendKeys(name);
		d.findElement(locator).clear();
	}
	
	public void verifyelementDisplay(By locator) {
		
		System.out.println(d.findElement(locator).isDisplayed());
	}
	
	public void verifyTitle(String expectedTitle) {
		//if any reference returns any value and if we want that value
		//We have to reference to another variable 
		String actualTitle = d.getTitle();
		
		if(actualTitle.equals(expectedTitle)) {
			
		}else {}
		
	}


}
