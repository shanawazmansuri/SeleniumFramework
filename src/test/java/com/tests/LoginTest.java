package com.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.basepage.BasePage;
import com.functions.LoginFunc;

public class LoginTest extends BasePage {
	
	LoginFunc log = new LoginFunc();

	@Test
	public void verifyLogin() {
		log.loginFunc();
		
	}


}
