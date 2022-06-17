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

    @FindBy(id = "php-travels")
    public WebElement phpLink;

    @FindBy(linkText = "Pop-Up")
    public WebElement popUpBtn;


    public static HomePage getPage(){
        if (page == null)
            page = new HomePage();
        return page;
    }

}
