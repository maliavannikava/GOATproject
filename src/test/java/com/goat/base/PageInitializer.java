package com.goat.base;

import com.goat.pages.AddEmployeePageElements;
import com.goat.pages.DashboardPageElements;
import com.goat.pages.LanguagePageElements;
import com.goat.pages.LoginPageElements;
import com.goat.pages.QualificationsPageElements;

public class PageInitializer extends BaseClass{
	
	public static LoginPageElements login;
	public static DashboardPageElements dashboard;
	public static AddEmployeePageElements addEmp;
	public static QualificationsPageElements qual;
	public static LanguagePageElements language;
	
	public static void initialize() {
		
		login=new LoginPageElements();
		dashboard=new DashboardPageElements();
		addEmp=new AddEmployeePageElements();
		qual=new QualificationsPageElements();
		language=new LanguagePageElements();
	}
}
