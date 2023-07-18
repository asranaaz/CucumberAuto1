package datatableSD;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class DataTableStepDef {


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

    @When("^: User enters user\"([^\"]*\" first name$")
    public void user_enters_user_first_name(String userName) throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"u_3_b_lw\"]")).sendKeys(userName);
        Thread.sleep(1000);
    }

    @Then("^:User checks user first name is present$")
    public void user_checks_user_first_name_is_present(String userName) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        String userNameActual = driver.findElement(By.xpath("input//*[@id='u_3_b_Wq']")).getAttribute("value");
        Assert.assertEquals("userName", userNameActual);
        Thread.sleep(1000);
    }

    @And("^User enters user \"([^\"]*\"surname$")
    public void user_enters_surname(String surName) throws InterruptedException {
        driver.findElement(By.xpath("//input//*[@id=\"u_3_d_oL\"]")).sendKeys("surName");
        Thread.sleep(1000);
    }

    @But("^User mobile field should be blank$")
    public void user_mobile_field_should_be_blank() throws InterruptedException {
        String mobileActual = driver.findElement(By.xpath("//input[@id=\"u_3_g_tu\"]")).getAttribute("");
        Assert.assertEquals("", mobileActual);
        Thread.sleep(1000);


    }

    @Then("close browser")
    public void close_browser() {
        driver.quit();
        driver =null;

    }

    @Given("User need to be on Facebook login page")
    public void userNeedToBeOnFacebookLoginPage() {
        
    }

    @Then("User checks user{string} first name is present")
    public void userChecksUserFirstNameIsPresent(String arg0) {
        
    }

    @When("User enters mobile {string}")
    public void userEntersMobile(String arg0) {
    }

    @When("Enter following data")
    public void EnterFollowingdata(DataTable table) throws InterruptedException {

       List<List<String>> data = table.cells();

       String values1 = data.get(0).get(0);
        String values2 = data.get(0).get(1);
        String values3 = data.get(0).get(2);

        String values4 = data.get(1).get(0);
        String values5 = data.get(1).get(1);
        String values6 = data.get(1).get(2);

        driver.findElement(By.xpath("//input//*[@id=\"u_3_b_lw\"]")).sendKeys("values4");
        driver.findElement(By.xpath("//input//*[@id=\"u_3_d_oL\"]")).sendKeys("values5");
        Thread.sleep(2000);

    }

}