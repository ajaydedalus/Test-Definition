package lims.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import lims.step.JvmReport;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\xvd71\\eclipse-workspace\\TestDefinition\\src\\test\\resources\\Test.feature",glue="lims.stepDF",
dryRun=false,monochrome=true,plugin= {"json:C:\\Users\\xvd71\\eclipse-workspace\\TestDefinition\\Reports\\JsonReport\\TDefinition.json"})

public class TestRunner {
	@AfterClass
	public static void report() {
    JvmReport.generateJvmReport("C:\\\\Users\\\\xvd71\\\\eclipse-workspace\\\\TestDefinition\\\\Reports\\\\JsonReport\\\\TDefinition.json");

	}
}

