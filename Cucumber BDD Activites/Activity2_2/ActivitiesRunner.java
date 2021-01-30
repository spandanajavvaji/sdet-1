package CucumberTest;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/Features",
    glue = {"StepDefinitions"},
    tags = "@activity2_5",
    strict = true,
    plugin = {"pretty", "html:Test_Reports/Cucumber_Project_Report.html","json:Test_Reports/Cucumber_Project_Report.json"},
    monochrome = true
)

public class ActivitiesRunner {

}
