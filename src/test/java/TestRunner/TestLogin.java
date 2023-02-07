package TestRunner;


import ChromeDriver.DriverFactory;
import LandingPage.LandingPageSteps;
import PayerSummeryPage.PayerSummerySteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class TestLogin extends DriverFactory {


   LandingPageSteps landingPageActions;
    PayerSummerySteps payerSummerySteps;

    @Test
    public void userLoginHomePage() throws InterruptedException {
        setDriver();
        landingPageActions.dashboardLogin();

        String expectTitle = driver.getTitle();
        String actualTitle = "MADA Dashboard";
        Assert.assertEquals(expectTitle, actualTitle);

    }

}