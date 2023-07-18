package backgroundSD;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;




    @RunWith(Cucumber.class)
    @CucumberOptions(
            monochrome = true,
            //dryRun = true,
            plugin = {"pretty",
                    "html:target/cucumber-htmlreport",
                    "json:target/cucumber-report1.json",
                    "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
            },
            features = "src/main/java/resources/backgroundfeature",
            glue = {"backgroundSD"}
    )
    public class Runbackground{
}




