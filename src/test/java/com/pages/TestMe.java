package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestMe {

	WebDriver driver;

	public void firefox() {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", path + "/src/test/resources/drivers/geckodriver");
		driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
	}

	public void chrome() {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "/src/test/resources/drivers/chromedriver3");
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
	}

	public static void main(String[] args) {
		System.out.println("World");

		TestMe t = new TestMe();
		t.firefox();
		//t.chrome();
	}
	
}
