package week4.day2.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features="src/test/java/week4/day2/features/Asmt34hooks.feature",
		glue={"week4.day2.steps","week4.day2.hooks"},
		tags = "@create or @update"
		
		
		)

public class TestRunner extends AbstractTestNGCucumberTests{

}

