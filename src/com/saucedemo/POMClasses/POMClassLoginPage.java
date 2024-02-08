package com.saucedemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClassLoginPage {
	
	WebDriver driver;
	
	//Username text box
	@FindBy(xpath="//input[@id='user-name']")
	WebElement UsernameTextBox;
	
	public void sendusername() {
		
		UsernameTextBox.sendKeys("standard_user");
	}
	
	//password text box
	@FindBy(xpath="//input[@id='password']")
	WebElement PasswordTextBox;
	
	public void password() {
		
		PasswordTextBox.sendKeys("secret_sauce");
		
	}
	
	//Login Button functionality
	
	@FindBy(xpath="//input[@id='login-button']")
	WebElement LoginButton;
	
	public void ClickOnLoginButton() {
		
		LoginButton.click();
		
	}
	
	public POMClassLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	

}
