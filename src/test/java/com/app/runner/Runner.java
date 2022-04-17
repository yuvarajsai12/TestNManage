package com.app.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "C:\\Users\\Yuvaraj\\eclipse-workspace"
		+ "\\CucumberSample\\src\\test\\java\\com\\app\\feature",
		glue= {"com.app.stepdefinition"},
		monochrome=true, 
		publish= true, 
		tags= "@smoke",
		dryRun=false)
public class Runner {

}
