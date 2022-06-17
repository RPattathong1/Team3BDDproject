package step_definitions;

import pages.CodingDashboardPage;
import pages.SoftSkillsDashboardPage;

public class SoftSkillsDashboardSteps {
    SoftSkillsDashboardPage softSkillDashboardPage;
    CodingDashboardPage codingDashboardPage;

    public SoftSkillsDashboardSteps(){
        softSkillDashboardPage = new SoftSkillsDashboardPage();
        codingDashboardPage = new CodingDashboardPage();
    }

}
