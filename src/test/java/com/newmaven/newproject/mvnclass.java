package com.newmaven.newproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class mvnclass{
	WebDriver driver;
	@Test
	public void browser() {
		 driver=new FirefoxDriver();
		 driver.get("https://www.google.com/");
	}
}
