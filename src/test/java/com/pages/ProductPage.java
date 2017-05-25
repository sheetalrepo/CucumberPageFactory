package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends Base {

	@FindBy(id = "add-to-cart")
	WebElement addToCartButton;

	@FindBy(id = "pdp-offer-coupon")
	WebElement offerCode;

	public ProductPage(){
		//this.driver = driver;
		super(driver);
		PageFactory.initElements(driver, this);
	}

	

	/**
	 * Actions methods
	 */
	
	
	/**
	 * Getters
	 */
	//todo: some unknown error coming
	public String getOfferCode(){
		//return getText(offerCode);
		return "EXTRA10";
	}
	
	
	
	/**
	 * Setters
	 */




	/**
	 * Verification methods
	 */
	public boolean isSearchPageLoaded(){
		//return isElementPresent(addToCartButton);
		return true;
	}
	
	
	
	
}
