package runners.parallelRun;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/reports/parallel/popUp.html",
        "rerun:target/rerun.txt"},
        features = "src/test/resources/features",
        glue = {"step_definitions"},
        stepNotifications = true,
        dryRun = false,
        tags = "@popUpScenarios"
)
public class PopUpRunner {
}
