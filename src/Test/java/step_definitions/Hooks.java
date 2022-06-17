package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.ConfigReader;
import utils.WebDriverManager;

public class Hooks {

    @Before
    public void setUp(){
        WebDriverManager.getDriver().get(ConfigReader.readProperty("url"));
    }

    @After
    public void tearDown(){

        WebDriverManager.closeDriver();
    }
}
