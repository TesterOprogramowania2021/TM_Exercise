package org.example;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","json:target/cucumber.json"},
        features = "src/test/java/featureFiles/allegroTest.feature",
        glue = {"steps"},
        tags = {"@Test"})
public class RunCucumberTest {
}