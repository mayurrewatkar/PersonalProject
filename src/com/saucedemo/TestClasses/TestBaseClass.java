package com.saucedemo.TestClasses;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.saucedemo.POMClasses.POMClassLoginPage;
import com.saucedemo.UtilityClass.TakeScreenShot;

public class TestBaseClass {
	
	WebDriver driver;
	@Parameters("browsername")
	@BeforeMethod
	public void SetUp(String browsername) throws IOException {
		
		if(browsername.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 driver=new ChromeDriver(options);
		}
		
		else if(browsername.equals("firefox")) {
		 
		 System.setProperty("webdriver.gecko.driver","D:\\chromedriver\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		 	driver=new FirefoxDriver();
		 	
		}
		 
		System.out.println("Browser is open");
		
		driver.manage().window().maximize();
		System.out.println("Browser is maximize");
		
		driver.get("https://www.saucedemo.com/v1/");
		System.out.println("URL is open");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//take screen shot
		
		TakeScreenShot.GetScreeshot(driver);
		System.out.println("Screenshot is taken");
		
		//login Activity
		POMClassLoginPage lp=new POMClassLoginPage(driver);
		lp.sendusername();
		System.out.println("Username is entered");
		
		lp.password();
		System.out.println("Password is entered");
		
		lp.ClickOnLoginButton();
		System.out.println("Click on login button");
		
		//take screen shot
		
				TakeScreenShot.GetScreeshot(driver);
				System.out.println("Screenshot is taken");
	}
	
	@AfterMethod
	public void TearDown() {
		
		driver.quit();
		
		System.out.println("Browser is close");
		
	}
	
	

}
