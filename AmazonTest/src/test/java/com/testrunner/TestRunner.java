package com.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(     
		
		features="CucumberFeature",
		glue="com.stepdefination"
		)



public class TestRunner extends AbstractTestNGCucumberTests {

}
