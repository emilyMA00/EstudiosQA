package com.wilder.automation.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/login.feature",
        glue = "com.wilder.automation.stepdefinitions",
        tags = "@test",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class LoginRunner {
}
