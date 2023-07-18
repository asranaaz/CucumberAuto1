package datadrivenSD;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        //monochrome = true,
        //dryRun = true,
        plugin={"pretty",
                "html:target/cucumber-htmlreport",
                "json:target/cucumber-report2.json",
                "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport2.html"
        },
        features = "src/test/java/resources/datadrivenfeature/",
        glue = {"datadrivenSD"}
)

public class RunDataDriven {
}
