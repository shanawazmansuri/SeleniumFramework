package com.tests;

import org.testng.annotations.Test;

import com.basepage.BasePage;
import com.pages.Test4Pg;

public class Test4 extends BasePage {

	// Test4Pg tp = new Test4Pg();

	@Test
	public void tc1()

	{

		openTab();
		driver.navigate().to("https://www.orangeHRM.com");
		System.out.println(getTitle());
		closeBrowser();
		switchtoParentWindow();
		System.out.println(getTitle()); // click(tp.about()); click(Test4Pg.about);
		back();
		System.out.println(gettext(Test4Pg.india));

	}

}
