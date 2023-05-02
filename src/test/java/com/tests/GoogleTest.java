package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.basepage.BasePage;
import com.functions.GoogleFunc;
import com.utilities.AllureReportListener;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Listeners(AllureReportListener.class)
public class GoogleTest extends BasePage {

	/*
	 * @Ignore
	 * 
	 * @Test
	 * 
	 * @Severity(SeverityLevel.NORMAL)
	 * 
	 * @Description("TC Description: To verify google title")
	 * 
	 * @Story("User Story 1")
	 * 
	 * @Feature("Title Test")
	 * 
	 * @Epic("001") public void test1() { gf.titleVerify(); }
	 * 
	 * @Ignore
	 * 
	 * @Test
	 * 
	 * @Severity(SeverityLevel.CRITICAL)
	 * 
	 * @Description("TC Description: To verify google search")
	 * 
	 * @Story("User Story 2")
	 * 
	 * @Feature("Search Test")
	 * 
	 * @Epic("002") public void test2() { gf.searchTest(); }
	 * 
	 * @Ignore
	 * 
	 * @Test
	 * 
	 * @Severity(SeverityLevel.NORMAL)
	 * 
	 * @Description("TC Description: To verify google search result")
	 * 
	 * @Story("User Story 3")
	 * 
	 * @Feature("Search Result")
	 * 
	 * @Epic("003") public void test3() { gf.searchResult(); }
	 */

	@Test(enabled = false)
	@Severity(SeverityLevel.NORMAL)
	@Description("TC Description: To verify click on About link")
	@Story("User Story 3")
	@Feature("About")
	@Epic("003")
	public void test4() {

		/*
		 * System.out.println("*****");
		 * driver.findElement(By.name("q")).sendKeys("Automation");
		 * driver.findElement(By.name("btnK")).click();
		 */
		/*
		 * WebElement user = driver.findElement(By.id("txtUsername"));
		 * user.sendKeys("Admin"); WebElement pwd =
		 * driver.findElement(By.id("txtPassword")); pwd.sendKeys("admin123 ");
		 */

		Wait(5000);
		WebElement btn = driver.findElement(By.id("btnLogin"));
		driver.findElement(RelativeLocator.with(By.tagName("input")).above(btn)).sendKeys("admin123");

	}
	
	@Test(enabled = true)
	public void test5()
	{
		GoogleFunc fg = new GoogleFunc();
		fg.enterSearch();
	}

}
