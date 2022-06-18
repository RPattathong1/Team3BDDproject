package step_definitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.CommonPage;
import pages.DashboardPage;
import utils.WebDriverManager;

import java.util.List;

public class DashboardSteps implements CommonPage {
    DashboardPage dashboardPage;

    public DashboardSteps(){
        dashboardPage = new DashboardPage();
    }

    @Then("Verify following buttons are displayed:")
    public void verifyFollowingButtonsAreDisplayed(List<String> data) {
        for(String each: data){
            Assert.assertTrue(WebDriverManager.isDisplayed(By.xpath(String.format(
                    XPATH_TEMPLATE_BUTTON, each))));
        }
    }

}

