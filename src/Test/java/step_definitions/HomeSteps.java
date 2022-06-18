package step_definitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.CommonPage;
import pages.HomePage;
import utils.WebDriverManager;


public class HomeSteps implements CommonPage {
    HomePage homePage;

    public HomeSteps() {
        homePage = new HomePage();
    }

    @Then("Verify Sign out link is displayed")
    public void verifySingOutLinkDisplayed() {
        Assert.assertTrue(WebDriverManager.isDisplayed(homePage.signOut));
    }

    @Then("Verify {string} link is displayed")
    public void verifyLinkIsDisplayed(String signOUt) {
        Assert.assertTrue(WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_LINKTEXT, signOUt))));
    }
    @Then("Verify {string} link is not displayed")
    public void verifyLinkIsNotDisplayed(String manageAccess) {
        Assert.assertFalse(WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_LINKTEXT, manageAccess))));
    }
}