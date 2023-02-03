package TestRunner;


import ChromeDriver.DriverFactory;
import Credentials.Base_URLs;
import FaileLinks.FailedUrl_Steps;
import HomePage.HomePageSteps;
import PayerSummeryPage.PayerSummerySteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.Credentials;

import static Credentials.Base_URLs.BaseUrl;
import static org.junit.Assert.assertTrue;

@RunWith(SerenityRunner.class)
public class TestFailedLinks extends DriverFactory {


    HomePageSteps homePage;


    PayerSummerySteps payerSummerySteps;
    FailedUrl_Steps failedUrlSteps;

    @Test
    public void userClickOnFailedLinks() throws InterruptedException {

        setDriver();
        homePage.dashboardLogin();
        payerSummerySteps.clickPayerSummery();
        failedUrlSteps.setFailedUrl_actions();

        String failedUrl = driver.getCurrentUrl();
        assertTrue(failedUrl.contains("FAILED"));

    }

}