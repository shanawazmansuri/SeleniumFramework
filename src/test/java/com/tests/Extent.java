package com.tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extent {
	
	@Test
	public void Reports()
	{
		
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("TestReport/Spark.html");
		/*
		 * ExtentAventReporter avent = new ExtentAventReporter("target/avent.html");
		 * ExtentEmailReporter email = new ExtentEmailReporter("target/email.html");
		 */
		extent.attachReporter(spark);
		spark.config().setReportName("Automation Execution Report");
		spark.config().setDocumentTitle("Automation Report");
		spark.config().setTheme(Theme.DARK);
		
		ExtentTest test1 = extent.createTest("MyFirstTest").assignAuthor("Shanawaz").assignCategory("Positive Test").assignDevice("Chrome 3");
		  test1.log(Status.PASS, "Entered User Name");
		  test1.log(Status.PASS, "Entered Password");
		  test1.log(Status.PASS, "Clicked on Login Button");
		  test1.log(Status.PASS, "Landed on Homepage");

		  
			ExtentTest test2 = extent.createTest("MySecondTest").assignAuthor("Shanawaz Mansuri").assignCategory("Negative Test").assignDevice("Chrome 4");;
			  test2.log(Status.PASS, "Verified the title");
			  test2.log(Status.PASS, "CLicked on Logout button");
			  test2.log(Status.PASS, "Signed Out from page");
			  test2.log(Status.PASS, "Displayed Signed Out window");
		  
		  
		extent.flush();

	}

}
