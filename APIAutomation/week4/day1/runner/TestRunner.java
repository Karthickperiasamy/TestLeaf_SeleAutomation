package week4.day1.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features="src/test/java/week4/day1/features/getIncidents.feature",
		glue="week4.day1.steps"
		
		
		)

public class TestRunner extends AbstractTestNGCucumberTests{

}
