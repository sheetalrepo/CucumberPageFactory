package com.stepdefs;

import org.openqa.selenium.WebDriver;

import com.pages.Base;
import com.pages.JHomePage;
import com.pages.SearchPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by sheetalsingh on 18/05/17.
 */
public class HomeStepDefs{

	WebDriver driver;
	JHomePage homepage;
	SearchPage searchpage;
	
	
	@Given("^I am on home page$")
	public void i_am_on_home_page() throws Throwable {
		System.out.println(">>>>> driver in step def: "+driver);
		homepage = new JHomePage(driver);
	}

	@When("^I searched for \"([^\"]*)\"$")
	public void i_searched_for(String keyword) throws Throwable {
	   System.out.println("searching for "+keyword);
	   homepage.searchForKeyword(keyword);
	}

	@Then("^I got correct \"([^\"]*)\" results$")
	public void i_got_correct_results(String keyword) throws Throwable {
		searchpage = new SearchPage(driver);
		String url = searchpage.getCurrentUrl();
		String q = "q="+keyword;
		System.out.println(">>>>>>>>> u: "+url+"    "+q);
		Assert.assertTrue("Wrong SRP", url.contains("q="+keyword));
	}


}
