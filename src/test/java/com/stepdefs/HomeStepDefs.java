package com.stepdefs;

import org.openqa.selenium.WebDriver;

import com.pages.Base;
import com.pages.HomePage;
import com.pages.SearchPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by sheetalsingh on 18/05/17.
 */
public class HomeStepDefs {

	WebDriver driver;
	HomePage homepage;
	SearchPage searchpage;

	private Context context;

	public HomeStepDefs(Context context) {
		this.context = context;
	}

	@Given("^I am on home page$")
	public void i_am_on_home_page() throws Throwable {
		driver = context.getDriver();

		System.out.println(">>> Driver in home step def: " + driver);
		driver.get("http://www.jabong.com/");
		homepage = new HomePage(driver);
		System.out.println(">>> Homepage URL: "+homepage.getUrl());
	}

	@When("^I searched for \"([^\"]*)\"$")
	public void i_searched_for(String keyword) throws Throwable {
		homepage.searchForKeyword(keyword);
	}

	@Then("^I got correct \"([^\"]*)\" results$")
	public void i_got_correct_results(String keyword) throws Throwable {
		searchpage = new SearchPage(driver);
		String url = searchpage.getUrl();
		System.out.println(">>> SRP Url:  " + url);
		Assert.assertTrue("Wrong SRP", url.contains("?q=" + keyword + "&"));
	}

}
