package com.Hemlata.test.runners;

import org.testng.annotations.AfterClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/features",
		glue = "com.Hemlata.test.stepDefinitions",
		plugin = {"pretty", "html:target/cucumber-reports"}
		)


public class TestRunner extends AbstractTestNGCucumberTests  
{
	
@AfterClass
public void tearDown()
{
	
}
}
