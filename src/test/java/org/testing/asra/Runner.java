package org.testing.asra;

import io.cucumber.junit.Cucumber;



import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        //monochrome = true,
        //dryRun = true,
        plugin={"pretty",
"html:target/cucumber-htmlreport",
"json:target/cucumber-report7.json",
                "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport7.html"
},
        features = "src/test/java/resources/myfeature.feature",
        glue = {"org.testing.asra.MyStepDefination"}


)
public class Runner  {

}

