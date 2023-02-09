package AcquisitionMonitor;

import ChromeDriver.DriverFactory;
import javafx.scene.control.Alert;
import net.serenitybdd.core.pages.PageObject;

public class AcquisitionSteps extends PageObject {
    DriverFactory driverFactory;
    AcquisitionPageActions acquisitionPageActions;
    public void clickAcqMonitor(){
        acquisitionPageActions.clickOnAcquisitionMonitor();
        //Alert alert= driverFactory.driver.switchTo().alert();

    }
}
