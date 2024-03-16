package steps;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import common.googleBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.Ter;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.googleHomePage;

public class searchProducts extends googleBase{
	
	
	googleHomePage gp ;
	
	@Given("i am on the google homepage")
	public void i_am_on_the_google_homepage() {
		
		launchBrowser();
		
	}
	
	

	@When("i enter the {string} in the search bars")
	public void i_enter_the_in_the_search_bars(String goods_name)  {
		
		gp = new googleHomePage(driver);
		
		gp.enterProductNameInSearchBar(goods_name);
		
		
		
	}

	@When("i click on the search button")
	public void i_click_on_the_search_button() {
		
	   
		gp.clickOnSearchButton();
		
	}

	@Then("i can see the search result successfully")
	public void i_can_see_the_search_result_successfully() {
	    
		
		
		Assert.assertTrue(gp.verifySearchResult());
		
		closeAll();
		
		
		
	}

}
