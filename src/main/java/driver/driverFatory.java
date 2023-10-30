package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class driverFatory {

    static WebDriver driver;

    public void initBrowser(String browser){
        if (browser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        }
        if (browser.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
        }
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
