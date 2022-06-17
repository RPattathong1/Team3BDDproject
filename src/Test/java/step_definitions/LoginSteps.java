package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.CommonPage;
import utils.WebDriverManager;

import java.util.Map;


public class LoginSteps implements CommonPage {
    @When("User enters following credentials:")
    public void user_enters_following_credentials(Map<String, String> data) {
        for (String key : data.keySet()) {
            WebDriverManager.sendKeys(By.xpath(String.format(XPATH_TEMPLATE_INPUT_FIELD, key)), data.get(key));
        }
    }
    @And("User clicks on {string} button")
    public void userClicksOnButton(String buttonName) {
        WebDriverManager.click(By.xpath(String.format(XPATH_TEMPLATE_BUTTON, buttonName)));
    }
    @Then("Verify title of the page is {string}")
    public void verifyTitleOfThePageIs(String text) {
        Assert.assertEquals(WebDriverManager.getDriver().getTitle(), text);
    }

}