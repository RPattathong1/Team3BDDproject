package pages;

import org.openqa.selenium.support.PageFactory;
import utils.WebDriverManager;

public class SoftSkillsDashboardPage {
    private static SoftSkillsDashboardPage page;
    public SoftSkillsDashboardPage(){
        PageFactory.initElements(WebDriverManager.getDriver(), this);
    }

}
