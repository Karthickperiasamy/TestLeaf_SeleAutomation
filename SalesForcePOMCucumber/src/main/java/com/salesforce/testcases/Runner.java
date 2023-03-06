package com.salesforce.testcases;

import org.testng.annotations.DataProvider;

import com.salesforce.base.ProjectsSpecificActions;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;
// @RunWith
@CucumberOptions(features="src/main/java/com/salesforce/features/CreateNewOpportunity.feature",
				glue= {"com/salesforce/pages"},
				monochrome = true,
				publish = true,
				dryRun = false, // turn it to false once steps are defined in older versions
				snippets = SnippetType.CAMELCASE
//				tags = "@Smoke" // to execute a particular tag
				//tags = "@Smoke or @Sanity" // to execute either Smoke or regression tags
//				tags = "@Sanity and @Regression" // to execute if both tags are present
//				tags = "not @Regression" // to exclude a particular tag
				)
public class Runner extends ProjectsSpecificActions{

	@DataProvider(parallel= true)
    public Object[][] scenarios() {
        return super.scenarios();
        }
	
}

