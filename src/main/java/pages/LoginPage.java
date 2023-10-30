package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(xpath = "//*[@name='username']")
    private WebElement userName;
    @FindBy(xpath = "//*[@type='password']")
    private WebElement password;
    @FindBy(css = "button[type='submit']")
    private WebElement loginButton;

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(this.driver,this);
    }

    public void enterUserName(String user){
        userName.sendKeys(user);
    }
    public void enterPassword(String passWord){
        password.sendKeys(passWord);
    }
    public void clickLoginButton(){
        loginButton.click();
    }
}
