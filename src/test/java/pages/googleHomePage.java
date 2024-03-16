package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class googleHomePage {
	
	WebDriver driver; 
	
	public googleHomePage(WebDriver dr) {
		
		driver = dr;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className = "gLFyf") 
	WebElement  searchBar;
	
	@FindBy(name = "btnK") 
	WebElement searchButton;
	
	@FindBy(id = "result-stats")
	WebElement searchResult;
	
	
	public  void enterProductNameInSearchBar(String goods_name) {
		
		searchBar.sendKeys(goods_name);
		
		WebElement sp = driver.findElement(By.xpath(goods_name));
		
	}
	
	public void clickOnSearchButton() {
		
		searchButton.submit();
	}
	
   public boolean verifySearchResult() {
		
		return searchResult.isDisplayed(); 
	}
   
   
	
	

}
