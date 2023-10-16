package com.bit;

import org.openqa.selenium.By;

public class Senerio {
	
	
	Target dr = new Target();
	
	
public void targetSignUp() {
	dr.open();
	dr.clickElement(By.xpath("//div[text()='Sign In']"));
	dr.clickElementbyXpath("//div[text()='Sign In']");
	dr.typeOnAnyElement(("woo092@woo.com"), By.cssSelector("input[type]"));
	dr.verifyelementDisplay(By.cssSelector("//div[text()='Sign In']"));
	dr.close();

}

}
