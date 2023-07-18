package sharedataSD;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class sharedataStepDef {

    WebDriver driver ;

    public sharedataStepDef(SharedClass share){
        driver = share.setup();
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







    }














