package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin ={"pretty", 
				"html:test_results/cucumber_html",
				"json:test_results/cucumber_json"},
		features="./src/test/resources/features",
		glue="steps_definition",
		tags="@itemsTest",
		dryRun=false
		)
public class TestRunners {

}
