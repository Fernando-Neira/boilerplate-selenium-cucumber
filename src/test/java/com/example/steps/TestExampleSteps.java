package com.example.steps;

import com.example.page.ExampleTestPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TestExampleSteps {

    Logger logger = Logger.getLogger(this.getClass().getName());

    private final ExampleTestPage exampleTestPage = new ExampleTestPage();

    @And("type {string} in search box")
    public void typeInSearchBox(String arg0) {
        logger.log(Level.INFO, "typing \"{0}\" in search box", arg0);
        exampleTestPage.typeSearch(arg0);
    }

    @When("press search button")
    public void pressSearchButton() {
        logger.log(Level.INFO, "pressing search button");
        exampleTestPage.pressSearchButton();
    }

    @Then("watch result list")
    public void watchResultList() {
        logger.log(Level.INFO, "watching result list");

    }

}
