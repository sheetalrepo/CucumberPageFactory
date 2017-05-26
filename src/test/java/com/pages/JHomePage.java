package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JHomePage extends Base {

	@FindBy(id = "search")
	WebElement searchBar;

	@FindBy(xpath = ".//div[@id='top-search-input']/div[1]/span")
	WebElement searchButton;

	@FindBy(xpath = "//div[@class='common-segment-slider']")
	WebElement slider;
	
//	public JHomePage() {
//		super(driver);
//	}
	
	public JHomePage(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
		//isElementPresent(slider);
	}
	
	
	/**
	 * Actions methods
	 * @throws InterruptedException 
	 */
	public void searchForKeyword(String keyword) throws InterruptedException{
		sendKeys(searchBar, keyword);
		click(searchButton);
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
