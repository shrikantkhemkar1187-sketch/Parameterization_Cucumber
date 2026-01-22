package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
		features = "D:\\Wishtree\\UpSkill\\Eclipse_Projects\\CUCUMBER\\Parameterization_Cucumber\\src\\test\\resources\\AllFeature\\test.feature"
		,	extraGlue="stepdefinations"
		,	dryRun = false
		,	plugin = {
				"html:Reports/test1.html"
				,	"json:Reports/test1.json"
				,	"junit:Reports/test1.xml"
				,	"pretty:Reports/test1.txt"
		}
		
		)

public class RunnerTest extends AbstractTestNGCucumberTests{

}
