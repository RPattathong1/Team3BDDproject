package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.CommonPage;
import pages.CodingDashboardPage;
import utils.WebDriverManager;

public class CodingDashboardSteps<txt> implements CommonPage {
    CodingDashboardPage codingDashboardPage;

    public CodingDashboardSteps(){

        codingDashboardPage = new CodingDashboardPage();
    }
    public String inputTxt;
    public String editedTxt;

    @And(" User clicks on {string} button")
    public void userClicksOnButton(String dashboardName) {
        WebDriverManager.click(By.xpath(String.format(XPATH_TEMPLATE_BUTTON, dashboardName)));

    }
    @When("User enter question in text box")
    public void userEnterQuestionInTextBox() {
        inputTxt = "What is the best way to learn new language?";
        WebDriverManager.sendKeys(codingDashboardPage.questionTxtBox, inputTxt);
    }

    @When("User clicks on edit icon")
    public void userClicksOnEditIcon() {

        WebDriverManager.click(codingDashboardPage.editIcon);
    }

    @And("User edits question")
    public void userEditsQuestion() {
        editedTxt = "What's the best way to learn?";
        WebDriverManager.sendKeys(codingDashboardPage.questionContent,editedTxt);
    }

    @And("User clicks on check mark")
    public void userClicksCheckMark() {

        WebDriverManager.click(codingDashboardPage.checkmarkIcon);
    }

    @Then("Verify edited question is correct")
    public void verifyQuestionDisplayIsCorrect() {
        Assert.assertEquals(editedTxt, WebDriverManager.getText(codingDashboardPage.questionContent));
    }

    @When("User clicks on delete icon")
    public void userClicksOnDeleteIcon() {

        WebDriverManager.click(codingDashboardPage.deleteIcon);
    }

    @Then("Verify question was deleted")
    public void verifyQuestionWasDeleted() {

        Assert.assertFalse(editedTxt,false);
    }

    @When("User clicks on Enter new question button")
    public void userClicksOnEnterNewQuestionButton(String btn) {
        WebDriverManager.click(By.xpath(String.format(XPATH_TEMPLATE_BUTTON, btn)));
    }
    @And("User enters question in text box")
    public void userEntersQuestionInTextBox() {
        inputTxt = "Do you like Java?";
        WebDriverManager.sendKeys(codingDashboardPage.questionTxtBox, inputTxt);
    }
    @And("User clicks Enter button")
    public void userClicksEnterButton(String btn) {
        WebDriverManager.click(By.xpath(String.format(XPATH_TEMPLATE_BUTTON, btn)));
    }
    @Then("Verify question was added")
    public void verifyQuestionWasAdded(String question) {
        Assert.assertTrue(WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_TEXT, question))));
    }

}
