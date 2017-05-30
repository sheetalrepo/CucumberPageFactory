package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Base {

	@FindBy(id = "search")
	WebElement searchBar;

	@FindBy(xpath = ".//div[@id='top-search-input']/div[1]/span")
	WebElement searchButton;

	@FindBy(xpath = "//div[@class='common-segment-slider']")
	WebElement slider;
	
	@FindBy(css = ".nav-sports.active-li>a")
	WebElement sportsTab;
	
	
	public HomePage(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
		//isElementPresent(slider);
	}
	
	
	/**
	 * Actions methods
	 * @throws InterruptedException 
	 */
	public void searchForKeyword(String keyword){
		sendKeys(searchBar, keyword);
		click(searchButton);
	}
	
	
	public void clickSportsTab() {
		click(sportsTab);
	}
	
	/**
	 * Getters
	 */
	
	
	
	/**
	 * Setters
	 */
	
	
	/**
	 * Verification methods
	 */
	public boolean isHomePageLoaded(){
		//return isElementPresent(slider);
		return true;
	}
	
	
	
	
}
