package tagsSD;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        //dryRun = true,
       // tags={"@Important"},//All scenario executed if this is tag for feature file
        //tags={"@Smoke"},//only tag with @smoke
       // tags={"@Smoke","@Regression"},//AND condition
        tags= "@Smoke,@Regression", //or Condition

        plugin={"pretty",
"html:target/cucumber-htmlreport",
"json:target/cucumber-report10.json",
 "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport10.html"
},
        features = "src/test/java/resources/tagsfeature",
        glue = {"tagsSD"}


)
public class RunTagsTest {
}

