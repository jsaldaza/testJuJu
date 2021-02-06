package com.motivaxion.demo2.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.junit.runner.RunWith;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/Autenticacion.feature",
        glue = "com.motivaxion.demo2.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class AutenticacionRunner {
}
