package runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;
import steps.BaseClass;
// @RunWith
@CucumberOptions(features="src/test/java/features",
				glue= {"steps"},
				monochrome = true,
				publish = true,
				dryRun = false, // turn it to false once steps are defined in older versions
				snippets = SnippetType.CAMELCASE,
//				tags = "@Smoke" // to execute a particular tag
				tags = "@Smoke or @Sanity" // to execute either Smoke or regression tags
//				tags = "@Sanity and @Regression" // to execute if both tags are present
//				tags = "not @Regression" // to exclude a particular tag
				)
public class Runner extends BaseClass{

}

