package cucumberOptions;

//import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//import io.cucumber.junit.CucumberOptions;
//import io.cucumber.junit.Cucumber;

@CucumberOptions(features="src/test/java/features", 
glue="stepDefinitions", monochrome=true)

public class CucumberRunner extends AbstractTestNGCucumberTests {

}
