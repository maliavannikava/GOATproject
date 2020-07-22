package com.goat.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.goat.base.BaseClass;
import com.goat.base.CommonMethods;

public class AddEmployeePageElements extends CommonMethods{
	
	@FindBy (id = "btnAdd")
	public WebElement add;
	
	@FindBy (id = "firstName")
	public WebElement addFName;
	
	@FindBy (id = "lastName")
	public WebElement addLName;
	
	@FindBy (id = "employeeId")
	public WebElement addId;
	
	@FindBy (id = "btnSave")
	public WebElement saveBtn;

	
	public void addEmp(String fName, String lName, String id) {
		click(add);
		sendText(addFName, fName);
		sendText(addLName, lName);
		sendText(addId, id);
		click(saveBtn);
	}
	
	public AddEmployeePageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}	
}
