package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class regression2 {
	
	
	WebDriver driver; 
	
	@Given("i am on the ebay home page")
	public void i_am_on_the_ebay_home_page() {
	   
		WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();
		
		 
		 
		driver.get("https://www.ebay.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

}
