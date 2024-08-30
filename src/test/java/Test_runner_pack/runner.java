package Test_runner_pack;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { ".//Features/" }, 
				 glue = "Step_deff", 
				 dryRun = true,
				// monochrome=false,
				 plugin = {"pretty", 
						   "html:test-output",
						   "json:json_output/cucumber.json",
		  				   "junit:junit_xml/cucumber.xml" }
         
               )

public class runner {

}
