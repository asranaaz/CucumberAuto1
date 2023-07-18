package multiSD;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        //monochrome = true,
        //dryRun = true,
        plugin={"pretty",
"html:target/cucumber-htmlreport",
"json:target/cucumber-report6.json",
                "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport6.html"
},
        features = "src/test/java/resources/multifeature",
        glue = {"multiSD"}


)
public class RunMulti {
}

