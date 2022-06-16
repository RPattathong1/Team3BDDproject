package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverManager;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(WebDriverManager.getDriver(), this);
    }

}
