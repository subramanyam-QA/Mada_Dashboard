package ChromeDriver;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static Credentials.Base_URLs.BaseUrl;

public class DriverFactory extends PageObject {

    @Managed(driver = "chrome")
    public WebDriver driver;

    public void setDriver(){
    driver.manage().window().maximize();
    driver.get(BaseUrl);




}


}

