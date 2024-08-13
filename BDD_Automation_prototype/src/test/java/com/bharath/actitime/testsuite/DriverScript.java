package com.bharath.actitime.testsuite;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features="src/test/resources/FeatureFiles",
		glue="com.bharath.actitime.stepdefination"
		)
public class DriverScript extends AbstractTestNGCucumberTests {

}
