package week4.day1.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features="src/test/java/features/getIncidentswithQP.feature",
		glue="steps"
		
		
		)

public class TestRunner extends AbstractTestNGCucumberTests{

}
