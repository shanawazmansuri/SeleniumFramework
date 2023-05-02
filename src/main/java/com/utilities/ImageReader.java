package com.utilities;

import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class ImageReader {
	
	public void readImage(String file) {
		ITesseract img = new Tesseract();
		img.setDatapath("D:\\Selenium\\Codes\\SelXpress\\tessdata");
		try {
			String txt = img.doOCR(new File(file));
			System.out.println(txt);
		} catch (TesseractException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}