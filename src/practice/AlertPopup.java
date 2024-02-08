package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertPopup {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		WebElement ClickButton=driver.findElement(By.xpath("//button[@id='alertButton']"));
		ClickButton.click();
		
		//transfer the focus of selenium
		
		Alert alt=driver.switchTo().alert();
		
		//handle that alert
		alt.accept();
		
		WebElement ClickButton2=driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		ClickButton2.click();
		
		Alert alts=driver.switchTo().alert();
		alts.accept();
		
		WebElement ClickButton3=driver.findElement(By.xpath("//button[@id='confirmButton']"));
		ClickButton3.click();
		
		System.out.println("End of Program");
	}

}
