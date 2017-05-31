package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by sheetalsingh on 17/05/17.
 */
public class Base {

	WebDriver driver;
	WebDriverWait wait;

	public Base(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 10);
	}

	/**
	 * Common explicit wait methods; 
	 */
	public void waitForVisibilityOfElement(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * Common explicit wait methods
	 */
	public void waitForClickablityOfElement(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public boolean isElementPresent(WebElement element) {
		waitForVisibilityOfElement(element);
		return element.isDisplayed();
	}
	
	public void click(WebElement element) {
		waitForClickablityOfElement(element);
		element.click();
	}

	public void sendKeys(WebElement element, String keyword) {
		waitForVisibilityOfElement(element);
		element.clear();
		element.sendKeys(keyword);
	}

	public String getText(WebElement element) {
		waitForVisibilityOfElement(element);
		return element.getText();
	}

	public String getAttributeValue(WebElement element, String attribute) {
		waitForVisibilityOfElement(element);
		return element.getAttribute(attribute);
	}

	public String getUrl() {
		System.out.println(">>>>>>>>>>>>>>>    Base Page getUrl() driver:   " + driver);
		return driver.getCurrentUrl();
	}
	
	

}
