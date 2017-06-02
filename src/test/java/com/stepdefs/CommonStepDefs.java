package com.stepdefs;

import org.junit.Assert;

import cucumber.api.java.en.Then;

public class CommonStepDefs {

	@Then("^I verify that (\\d+) is greater than (\\d+)$")
	public void i_verify_that_is_greater_than(int arg1, int arg2) throws Throwable {
		Assert.assertTrue("Assertion fails", arg1 > arg2);
		System.out.println(">>> Assert Passed");
	}

}
