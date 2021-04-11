package com.example.test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com.example.steps"
        ,features = "src/test/resources/features"
//        ,tags = ""
)
public class ExampleRunner {

}
