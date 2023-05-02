package com.utilities;

import java.net.MalformedURLException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportConf {
	public static ExtentSparkReporter reporter;
	public static ExtentReports extent;
	public static ExtentTest test;

	public static void reportSetUp(String Classname) throws MalformedURLException {

		reporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/TestReport/" + Classname + ".html");
		reporter.config().setReportName("Automation Report");
		reporter.config().setDocumentTitle("Test Results");

		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Shanawaz Mansuri");
		extent.setSystemInfo("Environment", "QA Env");

	}

	public static void reportTearDown() {
		extent.flush();
	}
	
	public static ExtentTest createTest(String createTest) {
		  ExtentTest test = ExtentReportConf.extent.createTest(createTest);
		  return test;
		  
	 


/*	public static void createTest(String testName, String testType, String log) {
		test = extent.createTest(testName);

		if (testType.equalsIgnoreCase("Pass")) {
			test.pass(log);

		}

		else if (testType.equalsIgnoreCase("Fail")) {
			test.pass(log);
		}

		else if (testType.equalsIgnoreCase("Info")) {
			test.info(log);
		}

		else if (testType.equalsIgnoreCase("Warning")) {
			test.warning(log);
		}

		else if (testType.equalsIgnoreCase("Skip")) {
			test.skip(log);
		} else {
			System.out.println("Incorrect Log");
		}*/

	}

}
