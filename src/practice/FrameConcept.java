package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FrameConcept {
	
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//inspect the frame
		WebElement iframe=driver.findElement(By.xpath("//iframe[@id='frame2']"));
		
		//swith the focus of selenium to frame
		
		driver.switchTo().frame(iframe);
		
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='animals']"));
		dropdown.click();
		
		Select S=new Select(dropdown);
		S.selectByVisibleText("Big Baby Cat");
		
		
	}

}
