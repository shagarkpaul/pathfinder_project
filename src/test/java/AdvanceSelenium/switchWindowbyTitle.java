package AdvanceSelenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class switchWindowbyTitle {

	public static void main(String[] args) {
		
     WebDriver driver; 
		
		WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();
		 
		driver.get("https://the-internet.herokuapp.com/windows");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement clickHereButton = driver.findElement(By.linkText("Click Here"));

		clickHereButton.click(); 
		
		windowByTitle(driver, "New Window"); 
		
		System.out.println(driver.getTitle()); 

	}
	
	
	public static void windowByTitle(WebDriver driver, String title) {
		
		
		String mainWindow = driver.getWindowHandle(); 
		
		Set<String> windows = driver.getWindowHandles(); 
		
		for(String s : windows) {
			
			
			if(!driver.switchTo().window(s).getTitle().equals(title)) {
				
				driver.switchTo().window(mainWindow); 
			}
		}
		
		
	}

}
