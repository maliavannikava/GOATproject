package com.goat.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.goat.base.BaseClass;
import com.goat.base.CommonMethods;

public class QualificationsPageElements extends CommonMethods{
	
	@FindBy (xpath = "//ul[@id='sidenav']/li/a[text()='Qualifications']")
	public WebElement qualifications;
	
	@FindBy (id = "addLanguage")
	public WebElement addLngBtn;
	
	@FindBy (id = "language_code")
	public WebElement language;
	
	@FindBy (id = "language_lang_type")
	public WebElement fluency;
	
	@FindBy (id = "language_competency")
	public WebElement competency;
	
	@FindBy (id = "btnLanguageSave")
	public WebElement saveBtn;
	
	public QualificationsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
