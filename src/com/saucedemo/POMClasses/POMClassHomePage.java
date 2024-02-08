package com.saucedemo.POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClassHomePage {
	
	private WebDriver driver;
	
	//Inspect single product
	
	@FindBy(xpath="//button[text()='ADD TO CART']")
	private WebElement SingleProductAddToCart;
	
	public void ClickOnAddToCartButton() {
		
		SingleProductAddToCart.click();
	}
	
	//add to cart button
	
	@FindBy(xpath="//span[@class='fa-layers-counter shopping_cart_badge']")
	private WebElement AddToCartButton;
	
	public String CountofProduct() {
		
		String count=AddToCartButton.getText();
		return count;
	}
	
	//add multiple product
	
	@FindBy(xpath="//button[text()='ADD TO CART']")
	private List<WebElement> Multiplproducts;
	
	
	public void ClickOnMultipleProduct() {
		
		for(WebElement Multiplproduct : Multiplproducts ) {
			
			Multiplproduct.click();
		}
	}
	
	
	
	
	
	public POMClassHomePage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

}
