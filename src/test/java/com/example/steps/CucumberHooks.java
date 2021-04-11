package com.example.steps;

import com.example.driver.WebDriverHolder;
import com.example.driver.WebDriverManager;
import com.example.enums.DriverType;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHooks {

    @Before
    public void before() {
        WebDriverHolder.setWebDriverManager(new WebDriverManager(DriverType.CHROME));
    }

    @After
    public void after() {
//        WebDriverHolder.getWebDriverManager().close();
    }

}
