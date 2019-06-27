package Pack;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
//import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome=true,tags="@nandri")
//@CucumberOptions(monochrome=true,plugin={"pretty","json:Cucumber-reports-IP.json"})
public class RunnerIP 
{

}
