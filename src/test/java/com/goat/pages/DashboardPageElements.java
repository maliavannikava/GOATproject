package com.goat.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.goat.base.BaseClass;
import com.goat.base.CommonMethods;

public class DashboardPageElements extends CommonMethods{
	
	@FindBy (id = "menu_pim_viewPimModule")
	public WebElement pim;
	
	@FindBy (id = "menu_admin_viewAdminModule")
	public WebElement admin;
	
	@FindBy (id = "menu_admin_Qualifications")
	public WebElement qualifications;
	
	@FindBy (id = "menu_admin_viewLanguages")
	public WebElement languages;
	
	public DashboardPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
