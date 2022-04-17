package com.app.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.app.baseclass.BaseCLass;

public class LoginPageFactory extends BaseCLass {

	// Page Factory ->
	public LoginPageFactory() {
		PageFactory.initElements(driver, this);
	}

	// @FindBy single webelement
	@FindBy(id = "username")
	private  WebElement username;

	public  WebElement getUsername() {
		return username;
	}

	public  WebElement getPassword() {
		return password;
	}

	@FindBy(id = "passwor")
	private  WebElement password;
	
	
	//@FindBys here we can use more than one webelement like & opertaor
	@FindBys({
		@FindBy(id = "username"),
		@FindBy(name = "username")
	})
	private List<WebElement> element;
	
	//@FindAll here we can use more than one webelement like | operator
	@FindAll({
		@FindBy(id = "username"),
		@FindBy(name = "username")
	})
	private List<WebElement> element1;
	
	
	

}
