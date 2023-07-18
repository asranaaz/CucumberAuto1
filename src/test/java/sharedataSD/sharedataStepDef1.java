package sharedataSD;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class sharedataStepDef1 {

    WebDriver driver ;
    public void sharedataStepDef1(SharedClass share) {
        driver = share.setup();
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


    }










