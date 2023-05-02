package com.prac;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RetTest {
	
	WebDriver driver;
	
	@Test
	public void test1()
	
	{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		String title = driver.getTitle();
		org.testng.Assert.assertEquals(title, "Googl");
		
		
		
		
	}
	
	@AfterMethod
	public void close()
	{
		driver.quit();
		
	}

}
