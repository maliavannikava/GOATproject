package com.goat.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.goat.base.BaseClass;
import com.goat.base.CommonMethods;

public class LoginPageElements extends CommonMethods{
	
	@FindBy (id = "txtUsername")
	public WebElement username;
	
	@FindBy (id = "txtPassword")
	public WebElement password;
	
	@FindBy (id = "btnLogin")
	public WebElement loginBtn;
	
	public void login(String user, String pswrd) {
		sendText(username, user);
		sendText(password, pswrd);
		click(loginBtn);
	}
	
	public LoginPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
