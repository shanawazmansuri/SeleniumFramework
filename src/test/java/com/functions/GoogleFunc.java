package com.functions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.basepage.BasePage;
import com.pages.GooglePages;
import com.utilities.ExtentReportConf;

import io.qameta.allure.Step;
import junit.framework.Assert;

public class GoogleFunc extends BasePage {
	
	/*
	 * GooglePages gps = new GooglePages();
	 * 
	 * @Step("Login into Google site, Capture the title and verify that Title contains Google"
	 * ) public void titleVerify() { String title = getTitle(); //
	 * ExtentReportConf.reportPassLog("Captured title as: " + title);
	 * Assert.assertEquals(title, "Google"); System.out.println("Title is " +
	 * title); //ExtentReportConf.reportPassLog("Asserted title as: " + title);
	 * 
	 * }
	 * 
	 * @Step("Searching Text as Automation in Google") public void searchTest() {
	 * enterText(gps.googleText(), "Automation");
	 * //driver.findElement(By.name("q")).sendKeys("Automation");
	 * //ExtentReportConf.reportPassLog("Entered text as Automation");
	 * //driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
	 * click(gps.googleButton());
	 * //ExtentReportConf.reportPassLog("Clicked on Enter button");
	 * 
	 * }
	 * 
	 * @Step("Searching Text as Automation in Google") public void searchResult() {
	 * //ExtentReportConf.reportPassLog("Asserted search result text as: "
	 * +"Automation");
	 * 
	 * }
	 * 
	 * @Step("Clicking on About link") public void aboutClick() {
	 * 
	 * click(gps.logBtn); }
	 */
	
	public void enterSearch() {
		
		doEnterText(GooglePages.googleText(), "Automation");
		doClick(GooglePages.aboutLink());
	}
	
	

}