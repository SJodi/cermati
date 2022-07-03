import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
strict = true,
features = {"/Users/jodi/Downloads/Jodi/cermati/src/test/resources/features/API/GetProduct.feature"},
plugin = {"json:/Users/jodi/Downloads/Jodi/cermati/target/cucumber-parallel/1.json"},
monochrome = false,
tags = {"~@sequence"},
glue = {"Test"})
public class Parallel01IT {
}