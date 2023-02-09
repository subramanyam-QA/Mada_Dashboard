package AcquisitionMonitor;

import ChromeDriver.DriverFactory;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.Alert;

import static java.time.temporal.ChronoUnit.SECONDS;

public class AcquisitionPageActions extends PageObject {
    DriverFactory driverFactory;
    public void clickOnAcquisitionMonitor(){


        $("//a[text()='Acquisition Monitor']").click();
//        Alert alert= driverFactory.driver.switchTo().alert();
//        $("//input[@id='data-source-url-action-label']").click();
//        setImplicitTimeout(10,SECONDS);
//        $("//input[@id='data-source-url-action-label']").clear();
//        setImplicitTimeout(10,SECONDS);
//        $("//input[@id='data-source-url-action-label']").sendKeys("MedTech");


    }
}
