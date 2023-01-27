package ChromeDriver;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.TestsRequirement;
import org.openqa.selenium.WebDriver;

public class DriverFactory extends PageObject {

    @Managed(driver = "chrome")
    public WebDriver driver;



}

