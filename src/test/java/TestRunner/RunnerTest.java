package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
		features = "D:\\Wishtree\\UpSkill\\Eclipse_Projects\\CUCUMBER\\Parameterization_Cucumber\\src\\test\\resources\\AllFeature\\test.feature"
		,	glue="stepdefinations"
		,	dryRun = false
		,	plugin = {
				"html:Reports/test2.html"
				,	"json:Reports/test2.json"
				,	"junit:Reports/test2.xml"
				,	"pretty:Reports/test2.txt"
		}
		
		)

public class RunnerTest extends AbstractTestNGCucumberTests{

}
