package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		tags = "@SmokeTest",
		features = "Features",
		glue = "steps"
		)



public class somkeTests extends AbstractTestNGCucumberTests {
	
	

}
