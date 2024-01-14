package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"AllFeatureFiles/register.feature"},
		glue= {"Steps"},
		monochrome= true,
		dryRun= false
		//plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		
		)



public class Guru99TestRunner extends AbstractTestNGCucumberTests{

}
