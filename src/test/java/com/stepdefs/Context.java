package com.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Context {
	private static boolean initialized = false;

	private WebDriver driver;

	@Before
	public void setup() {
		System.out.println("***** Context: Inside Setup,  val: " + initialized);
		if (!initialized) {
			String path = System.getProperty("user.dir");
//			System.setProperty("webdriver.chrome.driver", path + "/src/test/resources/drivers/chromedriver.exe");
//			driver = new ChromeDriver();
			
			System.setProperty("webdriver.gecko.driver", path + "/src/test/resources/drivers/geckodriver.exe");
			driver = new FirefoxDriver();		
			
			initialized = true;
			System.out.println("***** Context: Initializing Driver   " + driver);
		}
	}

	public WebDriver getDriver() {
		System.out.println("***** Context: getDriver():   " + driver);
		return driver;
	}

	@After
	public void tearDownDriver() {
		initialized = false;
		System.out.println("***** Context: tearDown :" + initialized);
		driver.quit();
	}

}
