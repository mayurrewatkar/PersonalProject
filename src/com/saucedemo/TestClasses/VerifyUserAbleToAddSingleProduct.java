package com.saucedemo.TestClasses;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.POMClasses.POMClassHomePage;
import com.saucedemo.POMClasses.POMClassLoginPage;

public class VerifyUserAbleToAddSingleProduct extends TestBaseClass {
	
	
		
		@Test
		public void singleproductadd() {
		// HomePage activiyy
		POMClassHomePage hp=new POMClassHomePage(driver);
		hp.ClickOnAddToCartButton();
		String ActualResult=hp.CountofProduct();
		String ExpecteResult="1";
		
		//validation
		Assert.assertEquals(ActualResult, ExpecteResult,"Numbers are not matching");
	}

}

