package com.pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.basepage.BasePage;

public class WomenPg extends BasePage {
	
	public static List<WebElement> menusWomen() {
		List<WebElement> list = elements("//a[@class='sf-with-ul']");
		return list;
	}
	
	public static WebElement tShirtMenu() {
		WebElement tShirt = xpath("//a[text()='T-shirts']");
		return tShirt;
	}
	
	public static WebElement prod1() {
		List<WebElement> tShirt = elements("//a[@title='Faded Short Sleeve T-shirts']");
		return tShirt.get(1);
	}
	
	public static WebElement price() {
		WebElement pr = xpath("//span[@id='our_price_display']");
		return pr;
	}
	
	public static WebElement addCart() {
		WebElement cart = xpath("//utton[@name='Submit']/span");
		return cart;
	}

}
