package com.saucedemo.TestClasses;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import com.saucedemo.POMClasses.POMClassHomePage;
import com.saucedemo.POMClasses.POMClassLoginPage;
import com.saucedemo.UtilityClass.TakeScreenShot;

public class VerifyUserAbleToAddMultipleProduct extends TestBaseClass {
	
	
	
		@Test
		public void addmultipleproduct() throws IOException {
		//home page activity
		
	POMClassHomePage hp=new POMClassHomePage(driver);
	hp.ClickOnMultipleProduct();
		String ActualResult=hp.CountofProduct();
		String ExpectedResult="6";
		
		//take screen shot
		
				TakeScreenShot.GetScreeshot(driver);
				System.out.println("Screenshot is taken");
		
		//validation
		
		Assert.assertEquals(ActualResult, ExpectedResult);
	}
}
	
	
	


