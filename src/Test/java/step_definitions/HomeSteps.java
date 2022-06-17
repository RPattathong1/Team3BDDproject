package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.CommonPage;
import pages.HomePage;
import utils.CucumberLogUtils;
import utils.WebDriverManager;

public class HomeSteps implements CommonPage {
    HomePage homePage;

    public HomeSteps(){
        homePage = new HomePage();
    }


    @Then("Verify PHP Travels link is displayed")
    public void verifyPHPTravelsLinkIsDisplayed() {
        Assert.assertTrue(WebDriverManager.isDisplayed(homePage.phpLink));
    }

    @Then("Verify {string} link is displayed")
    public void verifyLinkIsDisplayed(String linkName) {
        Assert.assertTrue(WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_LINKTEXT, linkName))));
    }

    @Given("User opens {string} page")
    public void userOpensPage(String pageName) {
        WebDriverManager.click(By.xpath(String.format(XPATH_TEMPLATE_LINKTEXT, pageName)));
    }


    @Then("Verify {string} is enabled")
    public void verifyIsEnabled(String button) {
        Assert.assertTrue(WebDriverManager.isEnabled(
                WebDriverManager.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_LINKTEXT, button)))
        ));
    }
}
