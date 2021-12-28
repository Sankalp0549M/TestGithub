package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/", glue = { "stepDefinitions",
		"appHooks" }, tags = "@All", monochrome = true, plugin = { "pretty", "json:target/EbayReports/report.json", "junit:target/EbayReports/report.xml" }, publish = true)
public class TestRunner {
}
