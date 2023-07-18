package multiplesceanrioStepDef;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
        //monochrome = true,
        //dryRun = true,
        plugin={"pretty",
"html:target/cucumber-htmlreport",
"json:target/cucumber-report5.json",
                "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport5.html"
},
        features = "src/test/java/resources/multiplescenario.feature",
        glue = {"multipleScenarioStepDef"}


)
public class RunMultiple {
}

