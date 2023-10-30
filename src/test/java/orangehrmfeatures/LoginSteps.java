package orangehrmfeatures;

import driver.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.DashboardPage;
import pages.LoginPage;
import utility.ConfigLoader;

import java.io.IOException;

public class LoginSteps {

    DriverFactory driverFactory;
    LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
    DashboardPage dashboardPage = new DashboardPage(DriverFactory.getDriver());
    @Given("user should be on login page")
    public void user_should_be_on_login_page() throws IOException {
        driverFactory.initBrowser(ConfigLoader.readConfigData("url"));
    }
    @When("user enters username {string}")
    public void user_enters_username(String user) {
        loginPage.enterUserName(user);
    }
    @When("user enters password {string}")
    public void user_enters_password(String password) {
        loginPage.enterPassword(password);
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        loginPage.clickLoginButton();
    }
    @Then("user should redirect to Dashboard")
    public void user_should_redirect_to_dashboard() {
        Assert.assertTrue(dashboardPage.getProfilePicture().isDisplayed());
    }
}
