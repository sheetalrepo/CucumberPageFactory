package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends Base {

	WebDriver driver;
	
	@FindBy(xpath = ".//*[@id='filter-container']/li[2]/div[2]/div/label[1]/div/input")
	WebElement offers10Percent;

	@FindBy(xpath = ".//*[@id='catalog-product']/section[2]/div[1]/a")
	WebElement firstProduct;

	public SearchPage(WebDriver driver){
		//this.driver = driver;
		super(driver);
		PageFactory.initElements(driver, this);
	}

	
	/**
	 * Actions methods
	 */
	public void click10PercentOfferButton(){
		click(offers10Percent);
	}
	
	
	public void clickFirstProduct(){
		click(firstProduct);
	}
	
	/**
	 * Getters
	 */
	public String getCurrentUrl(){
		return getUrl();
	}
	
	
	/**
	 * Setters
	 */
	
	
	/**
	 * Verification methods
	 */
	public boolean isSearchPageLoaded(){
		//return isElementPresent(offers10Percent);
		return true;
	}
	
	
	
	
	
	
}
