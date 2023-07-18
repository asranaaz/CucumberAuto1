package datatableSD;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        //monochrome = true,
        //dryRun = true,
        plugin={"pretty",
                "html:target/cucumber-htmlreport",
                "json:target/cucumber-report3.json",
                "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport3.html"
        },
        features = "src/test/java/resources/datatablefeature/",
        glue = {"datatableSD"}
)

public class RunDataTable {
}
