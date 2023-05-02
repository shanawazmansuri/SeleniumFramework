package com.prac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelExec {

	ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

	@BeforeMethod
	@Parameters("browserName")
	public void browserSetting(String browserName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			setDriver(new ChromeDriver());

		} else if (browserName.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			setDriver(new EdgeDriver());

		}

		else if (browserName.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			setDriver(new FirefoxDriver());

		}

	}

	public void setDriver(WebDriver driver) {
		this.driver.set(driver);
	}

	public WebDriver getDriver() {
		return this.driver.get();
	}

	@Test
	public void test1()

	{

		System.out.println("Test 1 Thread No. " + Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		setDriver(new ChromeDriver());
		getDriver().get("https://www.google.co.in");
		System.out.println(getDriver().getTitle());

	}

	@AfterMethod
	public void tearDown() {
		getDriver().quit();

	}

	/*
	 * @Test public void test2()
	 * 
	 * { System.out.println("Test 2 Thread No. "+Thread.currentThread().getId());
	 * WebDriverManager.edgedriver().setup(); setDriver(new EdgeDriver());
	 * getDriver().get("https://www.msn.co.in");
	 * System.out.println(getDriver().getTitle()); getDriver().quit();
	 * 
	 * }
	 */

}
