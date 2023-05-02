package com.functions;

import java.io.IOException;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.basepage.BasePage;
import com.pages.WomenPg;
import com.tests.LoginTest;
import com.utilities.ExtentReportConf;
import com.utilities.ScreenShot;

public class WomanFunc extends BasePage {
	
	ExtentTest wom; 
	
	public void selectProd() throws IOException
	{
		
		try {
			LoginTest lt = new LoginTest();
			lt.verifyLogin();
			wom = ExtentReportConf.createTest("Woman Test");
			mouseHover(WomenPg.menusWomen().get(0));
			wom.pass("Mouse Hovered on Momen menu");
			click(WomenPg.tShirtMenu());
			wom.pass("Clicked on T-Shirt menu");
			scrollToElementUsingJavascriptExecutor(WomenPg.prod1(), driver);
			
			click(WomenPg.prod1());
			wom.pass("Clicked on product");
			click(WomenPg.addCart());	
			wom.pass("CLicked on Add to cart button");
		} catch (Exception e) {
			
			System.out.println("Inside Exception");
			String woo = ScreenShot.screenShotExtentReport(driver, "woman");
			wom.fail(e);
			wom.addScreenCaptureFromPath(woo);
			
			/* wom.addScreenCaptureFromPath(woo); */
	
			
		}
	}

}
