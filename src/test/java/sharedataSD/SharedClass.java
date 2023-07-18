package sharedataSD;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SharedClass {

    WebDriver driver;

    public void sharedataStepDef(SharedClass share){
        driver = share.setup();

    }

@Before
    public WebDriver setup() {
        if (driver == null) {
            System.setProperty("webdriver.http.factory", "jdk-http-client");
            System.setProperty("webdriver.chrome.whitelistedIps", "");
            System.setProperty("webdriver.chrome.driver",
                    "C:\\Users\\single\\OneDrive\\Desktop\\resources\\drivers_v1\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");
            options.addArguments("disable-infobars");

            ChromeDriver driver = new ChromeDriver(options);
        }
        return driver;
    }

    @After
public void tearDown(){
        driver.quit();
        driver=null;

    }
}











