package com.goat.test;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.support.ui.Select;

import com.goat.base.CommonMethods;
import com.goat.base.ConfigsReader;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test2 extends CommonMethods {

	@Given("user is logged in as an admin")
	public void user_is_logged_in_as_an_admin() {
		login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
		wait(2);
	}

	@When("user navigates to employee list")
	public void user_navigates_to_employee_list() {
		click(dashboard.pim);
	}

	@When("user creates new employee")
	public void user_creates_new_employee() {
		wait(2);
		addEmp.addEmp(ConfigsReader.getProperty("fName"), ConfigsReader.getProperty("lName"),
				ConfigsReader.getProperty("id"));
	}

	@When("user navigates to qualifications")
	public void user_navigates_to_qualifications() {
		jsClick(qual.qualifications);
	}

	@When("user chooses language, fluency and competency")
	public void user_chooses_language_fluency_and_competency(DataTable dataTable) {
		
		Select select=new Select(qual.language);
		Select select2=new Select(qual.fluency);
		Select select3=new Select(qual.competency);
		
		List<Map<String,String>> list1=dataTable.asMaps();
		for(Map<String, String> l:list1) {
			click(qual.addLngBtn);
			
			select.selectByVisibleText(l.get("language"));
			select2.selectByVisibleText(l.get("fluency"));
			select3.selectByVisibleText(l.get("competency"));
			click(qual.saveBtn);		
		}
	}

	@Then("user sees saved language")
	public void user_sees_saved_language() {
		
	}
}
