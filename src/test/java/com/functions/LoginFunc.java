package com.functions;

import org.testng.Assert;

import com.basepage.BasePage;
import com.pages.LoginPg;
import com.utilities.ExtentReportConf;

public class LoginFunc extends BasePage {

	LoginPg lg = new LoginPg();

	public void loginFunc() {

		waitTovisibleElement(lg.usrName(), 60);
		enterText(lg.usrName(), "usr00001");
		//ExtentReportConf.reportPassLog("Entered User Name as: " + "usr00001");
		waitTovisibleElement(lg.pwd(), 60);
		enterText(lg.pwd(), "demo");
		//ExtentReportConf.reportPassLog("Entered Password Name as: " + "demo");
		Wait(7000);
		click(lg.loginBtn());
		//ExtentReportConf.reportPassLog("Clicked on Login Button");
		waitTovisibleElement(lg.profileName(), 60);
		String profName = gettext(lg.profileName()).trim();
		Assert.assertEquals(profName, "Kevin Davis");
		//ExtentReportConf.reportPassLog("Asserted User Profile Name as: " + profName);

	}

}
