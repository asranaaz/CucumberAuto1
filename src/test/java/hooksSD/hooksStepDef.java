package hooksSD;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class hooksStepDef {

    WebDriver driver = null;

    @io.cucumber.java.Before(order=1)
    public void beforeSetup1() {
        System.out.println("in before1");
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.chrome.whitelistedIps", "");
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\single\\OneDrive\\Desktop\\resources\\drivers_v1\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("disable-infobars");

        ChromeDriver driver = new ChromeDriver(options);
    }

    @Before(order=2)
    public void beforeSetup12() {
        System.out.println("in before2");

    }

    @Given("^: User should be on facebook login page$")
    public void user_should_be_on_facebook_login_page() {

        driver.get("https://en-gb.facebook.com/");
        driver.findElement(By.xpath("//button[contains(string(), 'Allow all cookies')]")).click();
        driver.findElement(By.xpath("/html//a[contains(string(), 'Create new account')]")).click();

    }

    @When("^: User enters user\"([^\"]*\" first name$")
    public void user_enters_user_first_name(String userName) throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"u_3_b_lw\"]")).sendKeys(userName);
        Thread.sleep(1000);
    }

    @Then("^:User checks user first name is present$")
    public void user_checks_user_first_name_is_present(String userName) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        String userNameActual = driver.findElement(By.xpath("//*[@id=\"u_3_b_lw\"]")).getAttribute("value");
        Assert.assertEquals("userName", userNameActual);
        Thread.sleep(1000);
    }

    @And("^User enters user \"([^\"]*\"surname$")
    public void user_enters_surname(String surName) throws InterruptedException {
        driver.findElement(By.xpath("//input[@id=\"u_3_d_OL\"]")).sendKeys("surName");
        Thread.sleep(1000);
    }

    @Then("^User mobile field should be blank$")
    public void user_mobile_field_should_be_blank() throws InterruptedException {
        String mobileActual = driver.findElement(By.xpath("//input[@id=\"u_3_g_tu\"]")).getAttribute("");
        Assert.assertEquals("", mobileActual);
        Thread.sleep(1000);


    }

    //@Then("close browser")
    // public void close_browser(){
    //   driver.quit();
    // driver=null;

    // }


    @After(order=2)
    public void tearDown1() {
        System.out.println("in After1");
        driver.quit();
        driver = null;
    }

    @After(order=1)
    public void tearDown2() {
        System.out.println("in After2");


    }
}









