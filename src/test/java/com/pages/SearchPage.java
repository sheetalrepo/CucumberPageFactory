package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends Base {

	@FindBy(xpath = ".//*[@id='filter-container']/li[2]/div[2]/div/label[1]/a")
	WebElement firstOffer;

	@FindBy(xpath = ".//*[@id='catalog-product']/section[2]/div[1]/a")
	WebElement firstProduct;

	@FindBy(className = "filtered-brand")
	WebElement filteredBrand;

	public SearchPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		isElementPresent(firstProduct);
	}

	/**
	 * Actions methods
	 */
	public void clickFirstOfferRadioButton() {
		//todo: temporary hard coding
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		click(firstOffer);
	}

	public void clickFirstProduct() {
		click(firstProduct);
	}

	/**
	 * Getters
	 */

	public String getFilteredBrandText() {
		return getText(filteredBrand);
	}

	/**
	 * Setters
	 */

	/**
	 * Verification methods
	 */
	public boolean isSearchPageLoaded() {
		// return isElementPresent(offers10Percent);
		return true;
	}

}
