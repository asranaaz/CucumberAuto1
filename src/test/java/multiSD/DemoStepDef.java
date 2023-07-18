package multiSD;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DemoStepDef {
    WebDriver driver;

    @Given("^: User should be on demo site page$")
    public void user_should_be_on_demo_site_page() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.chrome.whitelistedIps", "");
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\single\\OneDrive\\Desktop\\resources\\drivers_v1\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("disable-infobars");

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://demo.automationtesting.in/Register.html");
    }


    
    @Given("User should be on demo site page")
    public void user_Should_Be_On_Demo_Site_Page() {

    }

    @When("User enters first name")
    public void user_Enters_First_Name() throws InterruptedException {
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Tom");
        Thread.sleep(1000);

    }
    @When("User enters last  name")
    public void user_Enters_Last_Name() throws InterruptedException {
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Jerry");
        Thread.sleep(1000);
    }
}
