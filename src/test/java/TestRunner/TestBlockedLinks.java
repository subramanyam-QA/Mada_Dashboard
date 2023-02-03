package TestRunner;


import BlockedLimks.BlockedLinks_Steps;
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
public class TestBlockedLinks extends DriverFactory {

    Base_URLs baseClass;

    HomePageSteps homePage;

    PayerSummerySteps payerSummerySteps;

    BlockedLinks_Steps blockedLinks_steps;

    @Test
    public void userUserClickOnBlockedLinks() throws InterruptedException {

        setDriver();
        homePage.dashboardLogin();
        payerSummerySteps.clickPayerSummery();
        blockedLinks_steps.clickBlockedLinks();

        String blockedUrl = driver.getCurrentUrl();
        assertTrue(blockedUrl.contains("BLOCKED"));

    }

}