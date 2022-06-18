package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverManager;

public class HomePage {
    private static HomePage page;
    public HomePage(){
        PageFactory.initElements(WebDriverManager.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='/login']//u")
    public WebElement signOut;
}