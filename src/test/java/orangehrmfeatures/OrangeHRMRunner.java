package orangehrmfeatures;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/orabgehrmfeatures"},
        glue = {"orangehrmfeatures"},
        publish = true
)
public class OrangeHRMRunner extends AbstractTestNGCucumberTests {
}
