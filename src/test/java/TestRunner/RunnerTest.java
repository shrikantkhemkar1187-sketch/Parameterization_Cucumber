package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
		features = "D:\\Wishtree\\UpSkill\\Eclipse_Projects\\CUCUMBER\\Parameterization_Cucumber\\src\\test\\resources\\AllFeature\\test.feature"
		,	extraGlue="stepdefinations"
//		,	dryRun = false
		,	plugin = {
				"html:Reports/test.html"
				,	"json:Reports/test.json"
				,	"junit:Reports/test.xml"
				,	"pretty:Reports/test.txt"
		}
		
		)

public class RunnerTest extends AbstractTestNGCucumberTests{

}
