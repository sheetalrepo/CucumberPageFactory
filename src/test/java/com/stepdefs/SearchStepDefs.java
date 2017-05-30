package com.stepdefs;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.pages.HomePage;
import com.pages.SearchPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchStepDefs {

	WebDriver driver;
	HomePage homepage;
	SearchPage searchpage;

	private Context context;

	public SearchStepDefs(Context context) {
		this.context = context;
	}

	@Then("^I am on search page$")
	public void i_am_on_search_page() throws Throwable {
		driver = context.getDriver();
		System.out.println(">>>>>>>>>>>>>>>>>> Driver in srp step def: " + driver);
		searchpage = new SearchPage(driver);
	}

	@When("^I click first offer$")
	public void i_click_first_offer() throws Throwable {
		Thread.sleep(3000);
		searchpage.clickFirstOfferRadioButton();

	}

	@Then("^filtered brand should get added in header$")
	public void filtered_brand_should_get_added_in_header() throws Throwable {
		Thread.sleep(5000);//remove it
		String brandText = searchpage.getFilteredBrandText();
		System.out.println(">>>>>>> brand text: " + brandText);
		//GET 15% OFF, USE CODE: MOOD15
		Assert.assertTrue("Filter not selected properly", brandText.contains("OFF, USE CODE: MOOD"));

	}
}
