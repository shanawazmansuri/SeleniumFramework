package com.pages;

import org.openqa.selenium.WebElement;

import com.basepage.BasePage;

public class LoginPg extends BasePage {
	
	public WebElement usrName() {
		WebElement usrName = name("userId");
		return usrName;
	}
	
	public WebElement pwd() {
		WebElement pwd = id("password");
		return pwd;
	}
	
	public WebElement loginBtn() {
		WebElement loginBtn = xpath("//button[text()='Login ']");
		return loginBtn;
	}
	
	public WebElement profileName() {
		WebElement prof = xpath("//div[@class='profile-name']");
		return prof;
	}
	
	

}
