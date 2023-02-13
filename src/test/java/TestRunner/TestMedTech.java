package TestRunner;

import AcquisitionMonitor.AcquisitionSteps;
import AcquisitionPage.CrudSteps;
import ChromeDriver.DriverFactory;
import LandingPage.LandingPageActions;
import LandingPage.LandingPageSteps;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestMedTech extends DriverFactory {

    LandingPageActions landingPageActions;
    LandingPageSteps landingPageSteps;
    AcquisitionSteps acquisitionSteps;
    CrudSteps crudSteps;


    @Test
    public void clickAcqisition() {
        setDriver();
        landingPageSteps.dashboardLogin();
        acquisitionSteps.clickAcqMonitor();

        String actualString = $("//a[text()='Acquisition Monitor']").getText();
        assertTrue(actualString.contains("Acquisition"));

        //crudSteps.setUpdateBtn();

    }
    }
