package com.app.pageexe;

import com.app.baseclass.BaseCLass;
import com.app.locators.LoginPage;
import com.app.locators.LoginPageFactory;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class LoginPageExecution extends BaseCLass {
	
	public static ExtentTest logger;
	/*// 1. scenrio using driver.findElement
	public static void login_username() {
		BaseCLass.typeData(BaseCLass.findElementById(LoginPage.username), "Aiite");
	}
	
	public static void login_password() {
		BaseCLass.typeData(BaseCLass.findElementById(LoginPage.password), "Aiite123");
	}
	
	// 2. Scenario using Abstract class
	public static void click_button() {
		BaseCLass.press(BaseCLass.findElementByAB(LoginPage.clickbutton));
	}*/
	
	// page Factory Method
	public static void login_username() {
		logger = extent.createTest("Login Page Test");
		BaseCLass.typeData(new LoginPageFactory().getUsername(), "Aiite");
		if(new LoginPageFactory().getUsername().getText().equals("Aiite")) {
			logger.log(Status.INFO, "Validation Login UserName");
			logger.log(Status.PASS, "Validation Login UserName Pass");
		}else {
			logger.log(Status.FAIL, "UserName Validation Failed");
		}
	}
	
	public static void login_password() {
		logger = extent.createTest("Login Page Test");
		BaseCLass.typeData(new LoginPageFactory().getPassword(), "Aiite123");
		if(new LoginPageFactory().getUsername().getText().equals("Aiite123")) {
			logger.log(Status.INFO, "Validation Login UserName");
			logger.log(Status.PASS, "Validation Login UserName Pass");
		}else {
			logger.log(Status.FAIL, "Password Validation Failed");
		}
		
	}

}
