package TestRunner;


import AcquisitionMonitor.AcquisitionSteps;
import AcquisitionPage.CrudSteps;
import ChromeDriver.DriverFactory;
import LandingPage.LandingPageSteps;
import PayerSummeryPage.PayerSummerySteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;

@RunWith(SerenityRunner.class)
public class TestLogin extends DriverFactory{


   LandingPageSteps landingPageActions;
    PayerSummerySteps payerSummerySteps;
    AcquisitionSteps acquisitionSteps;
    CrudSteps crudSteps;

    @Test
    public void userLoginHomePage() throws InterruptedException {
        setDriver();
        landingPageActions.dashboardLogin();

        String expectTitle = driver.getTitle();
        String actualTitle = "MADA Dashboard";
        Assert.assertEquals(expectTitle, actualTitle);

    }
    @Test
    public void clickAcqisition() throws InterruptedException {
        setDriver();
        landingPageActions.dashboardLogin();
        acquisitionSteps.clickAcqMonitor();

        String actualString =  $("//a[text()='Acquisition Monitor']").getText();
        assertTrue(actualString.contains("Acquisition"));

        crudSteps.setUpdateBtn();



    }

}