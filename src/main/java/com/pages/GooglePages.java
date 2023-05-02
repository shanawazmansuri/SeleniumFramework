package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;

import com.basepage.BasePage;

public class GooglePages extends BasePage {
	
	/*
	 * public WebElement about = xpath("//a[text()='About']"); public WebElement ind
	 * = driver.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(about));
	 * 
	 */
	public WebElement pwd = driver.findElement(By.id("txtPassword"));
	public WebElement logBtn = driver.findElement(RelativeLocator.with(By.tagName("input")).
			below(pwd));


	public static WebElement googleText() {
		WebElement gp = name("q");
		return gp;
	}

	public static WebElement googleButton() {
		WebElement gbutton = name("btnK");
		return gbutton;
	}
	
	public static WebElement aboutLink() {
		WebElement al = xpath("//a[text()='About']");
		return al;
	}

}
