package com.functions;

import java.io.IOException;

import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.basepage.BasePage;
import com.pages.LogPg;
import com.utilities.ExtentReportConf;
import com.utilities.ScreenShot;

import groovyjarjarantlr4.v4.runtime.misc.LogManager;

public class LogFunc extends BasePage {

	private String email;
	private String pwd;
	private ExtentTest test;
	private ExtentTest lo;

	public LogFunc(String email, String pwd) {
		this.email = email;
		this.pwd = pwd;
	}

	public LogFunc() {
	}

	public void loginFunc() throws IOException {

		try {
			Logger log = org.apache.logging.log4j.LogManager.getLogger();
			// assertTrue(false);
			test = ExtentReportConf.createTest("Login");
			waitToClick(LogPg.signIn(), 60);
			click(LogPg.signIn());
			test.pass("Clicked on SignIn Button");
			log.error("Clicked on SignIn button");

			enterText(LogPg.email(), email);
			test.pass("Entered Email");
			// ExtentReportConf.reportPassLog("Entered Email Is as: " + email);
			enterText(LogPg.password(), pwd);
			test.pass("Entered Password");
			// ExtentReportConf.reportPassLog("Entered Password Name as: " + pwd);
			// Wait(7000);
			click(LogPg.signIn2());
			test.pass("Clicked on Login Button");
			assertTrue(false);
	

		} catch (Exception e) {
			String women = ScreenShot.screenShotExtentReport(driver, "Wom");
			test.fail(e);
			test.addScreenCaptureFromPath(women);

		}

	}

	public void loginVerify() throws IOException {

		try {
			Logger log = org.apache.logging.log4j.LogManager.getLogger();
			// assertTrue(false);
			ExtentTest test = ExtentReportConf.createTest("Login");
			waitToClick(LogPg.signIn(), 60);
			click(LogPg.signIn());
			test.pass("Clicked on SignIn Button");
			log.error("Clicked on SignIn button");

			enterText(LogPg.email(), email);
			test.pass("Entered Email");
			// ExtentReportConf.reportPassLog("Entered Email Is as: " + email);
			enterText(LogPg.password(), pwd);
			test.pass("Entered Password");
			// ExtentReportConf.reportPassLog("Entered Password Name as: " + pwd);
			// Wait(7000);
			click(LogPg.signIn2());
			test.pass("Clicked on Login Button");

			String title = getTitle();
			Assert.assertEquals(title, "My account - My Store1");
			test.pass("Asserted Title as: " + title);

		} catch (Exception e) {
			String women = ScreenShot.screenShotExtentReport(driver, "Wom");
			test.fail(e);
			test.addScreenCaptureFromPath(women);

		}

	}

	public void logOut() {

		lo = ExtentReportConf.createTest("LogOut");
		click(LogPg.logOut());
		lo.pass("Clicked on LogOut Button");

		String title = getTitle();
		Assert.assertEquals(title, "Login - My Store");
		test.pass("Asserted Title as: " + title);

	}

}