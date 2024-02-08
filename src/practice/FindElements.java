package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElements {
	
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		WebElement UserName=driver.findElement(By.xpath("//input[@id='user-name']"));
		UserName.sendKeys("standard_user");
		
		WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
		Password.sendKeys("secret_sauce");
		
		WebElement ClickButton=driver.findElement(By.xpath("//input[@id='login-button']"));
		ClickButton.click();
		
		//driver.findelements method
		
		List<WebElement> AddToCart=driver.findElements(By.xpath("//button[text()='ADD TO CART']"));
		 for(int i=0;i<=AddToCart.size();i++) {
			 
			 AddToCart.get(i).click();
		 }
		}
	}


