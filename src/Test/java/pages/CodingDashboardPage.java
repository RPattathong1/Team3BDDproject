package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverManager;

public class CodingDashboardPage {
    private static CodingDashboardPage page;
    public CodingDashboardPage(){
        PageFactory.initElements(WebDriverManager.getDriver(), this);
    }
    @FindBy(id = "question")
    public WebElement questionTxtBox;

    @FindBy(xpath = "//button[@class='btn btn-sm-outline-warning'][last()]")
    public WebElement editIcon;

    @FindBy(xpath = "//button[@class='btn btn-sm-outline-danger ml-1'][last()]")
    public WebElement deleteIcon;

    @FindBy(xpath = "//div[@class='col-md-8']//p")
    public WebElement questionContent;

    @FindBy(xpath = "//button[@class='btn btn-sm-outline-success'][last()]")
    public WebElement checkmarkIcon;
}
