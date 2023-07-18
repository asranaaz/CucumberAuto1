package hooksSD;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        //monochrome = true,
        //dryRun = true,
        plugin={"pretty",
"html:target/cucumber-htmlreport",
"json:target/cucumber-report4.json",
                "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport4.html"
},
        features = "src/test/java/resources/hooksfeature",
        glue = {"hooksSD"}


)
public class Runhooks {
}

