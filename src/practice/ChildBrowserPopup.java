package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChildBrowserPopup {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//inspect search box
		
		WebElement SearchBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		SearchBox.sendKeys("Mobile");
		
		//inspect search button
		WebElement SearchButton=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		SearchButton.click();
		
		//inspect first element
		
		WebElement MobilePhone=driver.findElement(By.xpath("(//img[@class='s-image'])[1]"));
		MobilePhone.click();
		
		
		
		//find out address of child windows
		List<String> AddressOfPage=new ArrayList<String>(driver.getWindowHandles());
		System.out.println(AddressOfPage);
		
		//transfer focus of selenium to child browser
				driver.switchTo().window(AddressOfPage.get(1));
		
		//inspect add to kart button
		
	   WebElement AddtoCartButton=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
	    AddtoCartButton.click();
	}

}
