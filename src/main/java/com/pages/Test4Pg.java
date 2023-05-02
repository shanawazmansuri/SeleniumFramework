package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;

import com.basepage.BasePage;

public class Test4Pg extends BasePage {
	
	public static WebElement about = xpath("//a[text()='About']");
	public static WebElement india = xpath("//div[text()='India']");
	
	public static WebElement ad = driver.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(about));
	/*
	 * public WebElement about() { WebElement about = xpath("//a[text()='About']");
	 * return about; }
	 */
}
