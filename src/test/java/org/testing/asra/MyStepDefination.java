package org.testing.asra;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;


public class MyStepDefination {

 WebDriver driver;

    @Given("^: User should be on facebook login page$")
    public void user_should_be_on_facebook_login_page()
    {
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
        System.out.println("opening URL");

    }

    @When("^: User enters user first name$")
    public void user_enters_user_first_name() {

        driver.findElement(By.xpath("//input[@id=\"u_3_b_lw\"]")).sendKeys("David");
    }

    @Then("^:User checks user first name is present$")
    public void user_checks_user_first_name_is_present() {
        // Write code here that turns the phrase above into concrete actions
        String userFirstNameActual= driver.findElement(By.xpath("//input[@id=\"u_3_b_lw\"]")).getAttribute("value");
        Assert.assertEquals("David", userFirstNameActual);



    }


}



