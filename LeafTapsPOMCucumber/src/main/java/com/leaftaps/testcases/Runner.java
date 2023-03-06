package com.leaftaps.testcases;

import org.testng.annotations.DataProvider;

import com.leaftaps.base.ProjectSpecificActions;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features = "src/main/java/com/leaftaps/features/Login.feature", glue = {
		"com/leaftaps/pages" }, monochrome = true, publish = true, dryRun = false, // turn it to false once steps are
																					// defined in older versions
		snippets = SnippetType.CAMELCASE)
public class Runner extends ProjectSpecificActions {

	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
}
