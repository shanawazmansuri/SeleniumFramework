package com.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.basepage.BasePage;
import com.functions.WomanFunc;


public class WomenTest extends BasePage {
	
	WomanFunc wf = new WomanFunc();
	
	@Test
	public void womenProdSelection() throws IOException
	{
		wf.selectProd();
		
	}
}
