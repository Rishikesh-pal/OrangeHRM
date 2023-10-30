package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    @FindBy(xpath = "//header//*[@alt='profile picture']")
    private WebElement profilePicture;
    WebDriver driver;

    public DashboardPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public WebElement getProfilePicture(){
        return profilePicture;
    }


}
