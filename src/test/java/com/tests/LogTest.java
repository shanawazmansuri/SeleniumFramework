package com.tests;

import java.io.IOException;

import org.junit.Ignore;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.basepage.BasePage;
import com.functions.LogFunc;
import com.utilities.ExcelUtils;

public class LogTest extends BasePage {

	@DataProvider(name = "Login")
	public Object[][] loginData() {
		Object[][] data = ExcelUtils.excelData(".\\ExcelData\\SatelliteData.xls", "Login");
		return data;
	}

	@Test(dataProvider = "Login", priority = 1, retryAnalyzer = com.utilities.RetryAnalyser.class)
	public void loginTest(String email, String pwd) throws IOException {

		LogFunc lf = new LogFunc(email, pwd);
		lf.loginFunc();

	}

	/*
	 * @Test(dependsOnMethods = "loginTest", priority = 2) public void logOutTest()
	 * throws IOException { LogFunc lout = new LogFunc(); lout.loginFunc();
	 * 
	 * }
	 */

}
