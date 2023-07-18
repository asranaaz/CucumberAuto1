package sharedataSD;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        //monochrome = true,
        //dryRun = true,
        plugin={"pretty",
"html:target/cucumber-htmlreport",
"json:target/cucumber-report9.json",
                "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport9.html"
},
        features = "src/test/java/resources/sharedatafeature",
        glue = {"sharedataSD"}


)
public class Runsharedata {
}

