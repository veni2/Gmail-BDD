package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\veni\\eclipse-workspace\\com.gmail\\src\\main\\java\\Features\\login.Feature",
		glue= {"StepDefinitions"}
				//format = {"pretty","html:test-output"}
		)

public class TestRunner {

	
	
}
