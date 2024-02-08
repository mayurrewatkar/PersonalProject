package com.saucedemo.TestClasses;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.POMClasses.POMClassLoginPage;
import com.saucedemo.UtilityClass.TakeScreenShot;

public class VerifyLoginFunctionality extends TestBaseClass {
	
     
		
		@Test
		public void loginfunctionality() {
		//Home Page Validation
		String ExpectedResult="Swag Labs";
		String ActualResult=driver.getTitle();
		
		Assert.assertEquals(ActualResult, ExpectedResult,"Titles are not equal");
		
	}
}



