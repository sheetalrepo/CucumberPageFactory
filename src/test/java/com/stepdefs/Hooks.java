package com.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.pages.Base;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	WebDriver driver;
	Base basepage;

	@Before
	public void initDriver() {
		//System.out.println("------------- Before hooks --------------");
	}

	@After
	public void tearDownDriver() {
		//System.out.println("------------- After hooks --------------");
	}

}
