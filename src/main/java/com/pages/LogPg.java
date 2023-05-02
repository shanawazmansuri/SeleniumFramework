package com.pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.basepage.BasePage;

public class LogPg extends BasePage {

	public static WebElement signIn() {
		WebElement signIn = xpath("//a[@title='Log in to your customer account']");
		return signIn;
	}

	public static WebElement email() {
		WebElement email = id("email");
		return email;
	}

	public static WebElement password() {
		WebElement pwd = id("passwd");
		return pwd;
	}

	public static WebElement signIn2() {
		WebElement si2 = id("SubmitLogin");
		return si2;
	}
	
	public static WebElement userDetails() {
		WebElement usr = xpath("//a[@title='View my customer account']/span");
		return usr;
	}
	
	public static WebElement logOut() {
		WebElement lOut = xpath("//a[@title='Log me out']");
		return lOut;
	}
	
	
	
	

}
