package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= "C:\\Users\\ACC-152\\eclipse-workspace\\GmailAutomation\\src\\test\\java\\Features\\Gmail.feature" ,
		glue ="StepDefinitions",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty"}
				
		
		)
public class TestRun {

}
