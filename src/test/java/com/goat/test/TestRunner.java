package com.goat.test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features="src/test/resources/features", 
			glue="com/goat/test", 
			dryRun=false, 
			monochrome=true
			,plugin= {
					"pretty", 
					"html:target/cucumber-default-report", 
					"json:target/cucumber.json",
					"rerun:target/failed.txt"
					}
			)

	public class TestRunner {

}

