package runner;

import io.cucumber.junit.*;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "json:target/cucumber.json","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
        features = "src/test/resources/features",
        glue = "step_definitions",
        monochrome = true,
        dryRun = false
        //tags = "@Announced"
)
public class CukesRunner {

}
