package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * Created by sheetalsingh on 17/05/17.
 */
public class Base {

	public static WebDriver driver;
	WebDriverWait wait;
	
    public Base(WebDriver driver) {
		this.driver = driver;
	}

	public static WebDriver getDriver(){
    	//init firfox here
    	String path = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", path + "/src/test/resources/drivers/geckodriver");
    	driver = new FirefoxDriver();
    	return driver;
    }
    
    /**
	 * Common explicit wait methods; 
	 * Generic can be used be most of the cases
	 * 
	 * wait time need to be picked from properties file
	 */
	public void waitForVisibilityOfElement(WebElement element) {
		wait = new WebDriverWait(getDriver(), 10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * Common explicit wait methods
	 */
	public void waitForClickablityOfElement(WebElement element) {
		wait = new WebDriverWait(getDriver(), 10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
    
    public void click(WebElement element) {
		//waitForClickablityOfElement(element);
		element.click();
	}

	public void sendKeys(WebElement element, String keyword) {
		//waitForVisibilityOfElement(element);
		element.clear();
		element.sendKeys(keyword);
	}
	
	public String getText(WebElement element) {
		//waitForVisibilityOfElement(element);
		return element.getText();
	}

	public String getAttributeValue(WebElement element, String attribute) {
		//waitForVisibilityOfElement(element);
		return element.getAttribute(attribute);
	}
	
	public String getUrl(){
		return driver.getCurrentUrl();
	}
	
	
}
