package multiSD;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoogleStepDef {

    WebDriver driver;

    @Given("^: User should be on google page$")
    public void user_should_be_on_google_page() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.chrome.whitelistedIps", "");
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\single\\OneDrive\\Desktop\\resources\\drivers_v1\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("disable-infobars");

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com/");
    }

    @When("^User enters search string$")
    public void userEntersSearchString() {
        driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("selenium");
        
    }

    @Given("^User should be on google page$")
    public void userShouldBeOnGooglePage() {
    }
}