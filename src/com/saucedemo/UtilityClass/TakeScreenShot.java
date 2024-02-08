package com.saucedemo.UtilityClass;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShot {
	
	public static void GetScreeshot(WebDriver driver) throws IOException {
		
		LocalDateTime myObj = LocalDateTime.now();
		String CurrentDate	=myObj.toString().replace(":", "-").replace(".","-");
			
		       TakesScreenshot ts =(TakesScreenshot)driver;
		    File SourceFile   =ts.getScreenshotAs(OutputType.FILE);
		     
		    File DestinationFile=new File("D:\\ProjectScreenshot\\"+"SauceDemo"+ CurrentDate +".jpg");
		    FileHandler.copy(SourceFile, DestinationFile);
	}
	
	

}
