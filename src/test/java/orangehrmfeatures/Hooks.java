package orangehrmfeatures;

import driver.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utility.ConfigLoader;

import java.io.IOException;

public class Hooks {

    WebDriver driver;
    DriverFactory driverFactory;

    @Before
    public void launchBrowser(String browser) throws IOException {
        driver = driverFactory.initBrowser(ConfigLoader.readConfigData(browser));
        driver.manage().window().maximize();
    }

    @After
    public void teardown(){
        driver.quit();
    }
}
