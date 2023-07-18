package parameterizationSD;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        //monochrome = true,
        //dryRun = true,
        plugin={"pretty",
"html:target/cucumber-htmlreport",
"json:target/cucumber-report8.json",
                "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport8.html"
},
        features = "src/test/java/resources/parameterizationSD",
        glue = {"parameterizationSD"}


)
public class RunParameterization {
}

