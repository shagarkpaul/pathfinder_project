package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class googleBase {
	
	public WebDriver driver; 
	
	public  void launchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();
		
		 
		 
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
	}
	
	public void closeOne() {
		
		driver.close();
	}
	
  public void closeAll() {
		
		driver.quit();
	}
	

}
