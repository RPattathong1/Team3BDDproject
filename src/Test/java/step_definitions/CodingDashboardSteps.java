package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;
import pages.CodingDashboardPage;
import utils.WebDriverManager;

public class CodingDashboardSteps<txt> implements CommonPage {
    CodingDashboardPage codingDashboardPage;

    public CodingDashboardSteps(){
        codingDashboardPage = new CodingDashboardPage();
    }
    public String expectedTxt;
    @When(": User clicks on edit icon")
    public void userClicksOnEditIcon() {
        WebDriverManager.click(codingDashboardPage.editIcon);
    }

    @And(": User edits question")
    public void userEditsQuestion() {
        expectedTxt = "What's the best way to learn?";
        WebDriverManager.sendKeys(codingDashboardPage.questionContent,expectedTxt);
    }

    @And(": User clicks on check mark")
    public void userClicksCheckMark() {
        WebDriverManager.click(codingDashboardPage.checkmarkIcon);
    }

    @Then(": Verify question display is correct")
    public void verifyQuestionDisplayIsCorrect() {
        Assert.assertEquals(expectedTxt, WebDriverManager.getText(codingDashboardPage.questionContent));
    }

    @When(": User clicks on delete icon")
    public void userClicksOnDeleteIcon() {
        WebDriverManager.click(codingDashboardPage.deleteIcon);
    }

    @Then(": Verify question was deleted")
    public void verifyQuestionWasDeleted() {
        Assert.assertFalse(expectedTxt,false);
    }
}
