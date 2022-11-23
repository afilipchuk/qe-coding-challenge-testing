package com.automation.step_definitions;


import com.automation.utilities.ConfigReader;
import com.automation.utilities.DB_Util;
import com.automation.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;


public class Hooks {
    //UI scenarios only
    @Before()
    public void uiSetup() {
        Driver.getDriver().get(ConfigReader.read("url"));
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    //UI scenarios only
    @After()
    public void uiTearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Image for failed step");
        }
        Driver.closeBrowser();
    }

    //If we had a database, we would have a before and after for database(not used at this time)
    @Before("@database")
    public void dbSetup() {
        String url = ConfigReader.read("db.url");
        String username = ConfigReader.read("db.username");
        String password = ConfigReader.read("db.password");
        DB_Util.createConnection(url, username, password);
    }

    //If we had a database, we would have a before and after for database(not used at this time)
    @After("@database")
    public void dbTearDown() {
        DB_Util.destroy();
    }
}
