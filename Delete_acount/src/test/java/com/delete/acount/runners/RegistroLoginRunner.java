package com.delete.acount.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/delete.feature",
        glue = "com.delete.acount.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RegistroLoginRunner {
}