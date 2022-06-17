package pages;

import org.openqa.selenium.support.PageFactory;
import utils.WebDriverManager;

public class SoftSkillDashboardPage {
    private static SoftSkillDashboardPage page;
    public SoftSkillDashboardPage(){
        PageFactory.initElements(WebDriverManager.getDriver(), this);
    }
}
