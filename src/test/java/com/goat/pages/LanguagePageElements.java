package com.goat.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.goat.base.BaseClass;

public class LanguagePageElements {
	
	@FindBy (id = "btnAdd")
	public WebElement addBtn;
	
	@FindBy (id = "language_name")
	public WebElement languageName;
	
	@FindBy (id = "btnSave")
	public WebElement saveBtn;
	
	public LanguagePageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
