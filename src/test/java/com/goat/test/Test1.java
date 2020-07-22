package com.goat.test;

import com.goat.base.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test1 extends CommonMethods{
	
	@When("iser navigates to Admin")
	public void iser_navigates_to_Admin() {
		click(dashboard.admin);
	}

	@When("user navigates to Qualifications")
	public void user_navigates_to_Qualifications() {
		click(dashboard.qualifications);
	}

	@When("user clicks on Languages")
	public void user_clicks_on_Languages() {
		click(dashboard.languages);
	}

	@When("user clicks on Add")
	public void user_clicks_on_Add() {
		click(language.addBtn);
	}

	@When("user enters language and clicks save button")
	public void user_enters_language_and_clicks_save_button() {
		sendText(language.languageName, "Abrakadabra");
		click(language.saveBtn);
	}

	@Then("user sees added language")
	public void user_sees_added_language() {
	}
}
