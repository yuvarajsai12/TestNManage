package com.app.locators;

import org.openqa.selenium.By;

import com.app.baseclass.BaseCLass;

public class LoginPage extends BaseCLass {
	// passing locators as String
	public static String username="username";
	public static String password="password";
	
	//loctors for Abstarct method
	public static By clickbutton = By.id("login");

}
