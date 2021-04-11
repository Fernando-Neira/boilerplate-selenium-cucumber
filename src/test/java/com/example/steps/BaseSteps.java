package com.example.steps;

import com.example.driver.WebDriverHolder;
import io.cucumber.java.en.When;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseSteps {

    Logger logger = Logger.getLogger(this.getClass().getName());

    @When("open url {string}")
    public void openUrl(String arg0) {
        logger.log(Level.INFO, "opening url \"{0}\"", arg0);
        System.getProperty("user.dir");
        WebDriverHolder.getWebDriverManager().openURL(arg0);

    }

}
