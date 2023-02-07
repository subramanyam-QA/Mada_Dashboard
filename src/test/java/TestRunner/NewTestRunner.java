package TestRunner;

import ChromeDriver.DriverFactory;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
@CucumberOptions(features = "src/main/resources/Features",  //run feature file
glue = {"LoginStepDefinition"},                             //run stepDefinition
plugin={"pretty","html:target/Reports/report.html",
        "json:target/Reports/report.json",
        "junit:target/Reports/report.junit"}
)

public class NewTestRunner extends DriverFactory {

    public void runner(){
        setDriver();
    }


}
