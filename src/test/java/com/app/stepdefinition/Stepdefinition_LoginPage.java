package com.app.stepdefinition;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition_LoginPage {

	/*
	 * @Given("Login into facebook url") public void login_into_facebook_url() {
	 * System.out.println("Given Condition");
	 * 
	 * }
	 * 
	 * @When("Enter the user name {string}") public void enter_the_user_name(String
	 * username) { System.out.println("username " + username); }
	 * 
	 * @When("Enter the password {string}") public void enter_the_password(String
	 * password) { System.out.println("password " + password); }
	 * 
	 * @When("click the login button") public void click_the_login_button() {
	 * System.out.println("Click button"); }
	 * 
	 * @Then("Validate the error message {string}") public void
	 * validate_the_error_message(String error) {
	 * System.out.println("Validate error " + error); }
	 */

	/*@Given("Login into facebook url")
	public void login_into_facebook_url() {
		System.out.println("Given Condition");
	}

	@When("Enter the user name <{string}>")
	public void enter_the_user_name(String us) {
		System.out.println("username " + us);
	}

	@When("Enter the password <{string}>")
	public void enter_the_password(String pass) {
		System.out.println("password " + pass);
	}

	@When("click the login button")
	public void click_the_login_button() {
		System.out.println("Click button");
	}

	
	
	@Then("Validate the error message <{string}>")
	public void validate_the_error_message(String string) {
	  System.out.println(string);
	}

	@When("Enter the username {string}")
	public void enter_the_username(String string) {
		System.out.println(string);
	}

	@When("Enter the pass word {string}")
	public void enter_the_pass_word(String string) {
		System.out.println(string);
	}

	@When("click the loginbutton")
	public void click_the_loginbutton() {
		System.out.println("clickbutton");
	}

	@Then("Validate the errormessage {string}")
	public void validate_the_errormessage(String string) {
		System.out.println(string);
	}*/
	
	@Given("Login into facebook url")
	public void login_into_facebook_url() {
	   System.out.println("login url");
	}
	/*// asList data table concept
	@When("Enter the user name")
	public void enter_the_user_name(DataTable form) {
		List<String> list = form.asList();
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
	}*/
	// asLists data table
	/*@When("Enter the user name")
	public void enter_the_user_name(DataTable form) {
	 List<List<String>> lists = form.asLists();
	 System.out.println(lists.get(0).get(1));
	 System.out.println(lists.get(1).get(0));
	}*/
	
	/*// asMap using datatable
	@When("Enter the user name")
	public void enter_the_user_name(DataTable forms) {
		Map<String, String> map = forms.asMap(String.class, String.class);
		System.out.println(map.get("name1")); // Yuvaraj1
		System.out.println(map.get("name2")); // Yuvaraj2
	}*/
	// asMaps using datatable
	@When("Enter the user name")
	public void enter_the_user_name(DataTable forms) {
	   List<Map<String, String>> listmap = forms.asMaps();
	  System.out.println(listmap.get(0).get("Yuvaraj2"));
	}

	
	@When("Enter the password {string}")
	public void enter_the_password(String string) {
	   System.out.println(string);
	}
	@When("click the login button")
	public void click_the_login_button() {
	    System.out.println("Click button");
	}
	@Then("Validate the error message {string}")
	public void validate_the_error_message(String string) {
		System.out.println(string);
	
	}

	

}
