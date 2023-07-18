package multiplesceanrioStepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.Assert;

public class multipleScenarioSD {

    WebDriver driver;

    @Given("^: User should be on facebook login page$")
    public void user_should_be_on_facebook_login_page() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.chrome.whitelistedIps", "");
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\single\\OneDrive\\Desktop\\resources\\drivers_v1\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("disable-infobars");

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://en-gb.facebook.com/");
        driver.findElement(By.xpath("//button[contains(string(), 'Allow all cookies')]")).click();
        driver.findElement(By.xpath("/html//a[contains(string(), 'Create new account')]")).click();

    }

    @When("^: User enters user first name$")
    public void user_enters_user_first_name_is_present() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"u_3_b_lw\"]")).sendKeys("David");
        Thread.sleep(1000);
    }

    @Then("^:User checks user first name is present$")
    public void user_checks_user_first_name_is_present() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        String userNameActual = driver.findElement(By.xpath("//*[@id=\"u_3_b_lw\"]")).getAttribute("value");
        Assert.assertEquals("David", userNameActual);
        Thread.sleep(1000);
    }

    @And("^User enters surname$")
    public void user_enters_surname() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id=\"u_3_d_OL\"]")).sendKeys("Rogers");
        Thread.sleep(1000);
    }

    @But("^User mobile field should be blank$")
    public void user_mobile_field_should_be_blank() throws InterruptedException {
        String mobileActual = driver.findElement(By.xpath("//input[@id=\"u_3_g_tu\"]")).getAttribute("");
        Assert.assertEquals("", mobileActual);
        Thread.sleep(1000);




    }

    @Then("close browser")
    public void close_browser(){
        driver.quit();

    }

    @When("User enters user first name")
    public void userEntersUserFirstName() {
    }

    @And("User enters user surname")
    public void userEntersUserSurname() {
    }
}









