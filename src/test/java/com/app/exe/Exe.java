package com.app.exe;

import org.junit.Test;

import com.app.baseclass.BaseCLass;
import com.app.pageexe.LoginPageExecution;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Exe extends LoginPageExecution {

	@Test
	public void test1() {
		BaseCLass.url("https://adactinhotelapp.com/index.php");
		login_username();
		login_password();
	//	click_button();
		
	}
}
