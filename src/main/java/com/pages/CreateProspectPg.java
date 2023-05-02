package com.pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.basepage.BasePage;

public class CreateProspectPg extends BasePage {
	
	public WebElement hamburger() {
		WebElement ham = xpath("//div[@id='nav-icon1']");
		return ham;
	}
	
	
	public WebElement crProsMenu() {
		WebElement crPros = xpath("//span[text()='Create Prospect ']");
		return crPros;
	}
	
	public WebElement name() {
		WebElement name = name("Name");
		return name;
	}
	
	public WebElement pan() {
		WebElement pan = name("panNo");
		return pan;
	}
	
	public WebElement title() {
		WebElement title = xpath("//angular2-multiselect[@name='title']/div");
		return title;
	}
	
	public List<WebElement> titleOptions() {
		List<WebElement> titleOp = elements("//li[@class='pure-checkbox ng-star-inserted']/div/div/input/following::label");
		return titleOp;
	}
	
	public WebElement riskCat() {
		WebElement riskCat = xpath("//angular2-multiselect[@name='riskCategory']/div");
		return riskCat;
	}
	
	public List<WebElement> riskCatOptions() {
		List<WebElement> riskOp = elements("//li[@class='pure-checkbox ng-star-inserted']/div/div/input/following::label");
		return riskOp;
	}
	
	public WebElement dob() {
		WebElement dob = xpath("//input[@placeholder='DD-MM-YYYY']");
		return dob;
	}
	
	public WebElement submit() {
		WebElement sub = xpath("//button[text()=' Submit ']");
		return sub;
	}
	
	
	
	
	
	
	

}
