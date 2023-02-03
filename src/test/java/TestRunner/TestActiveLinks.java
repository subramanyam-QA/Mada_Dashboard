package TestRunner;


import ActiveLinks.ActiveLinks_Steps;
import ChromeDriver.DriverFactory;
import Credentials.Base_URLs;
import FaileLinks.FailedUrl_Steps;
import HomePage.HomePageSteps;
import PayerSummeryPage.PayerSummerySteps;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.Credentials;

import java.util.Arrays;
import java.util.List;

import static Credentials.Base_URLs.BaseUrl;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SerenityRunner.class)
public class TestActiveLinks extends DriverFactory {


    HomePageSteps homePage;

    PayerSummerySteps payerSummerySteps;

    ActiveLinks_Steps activeLinks_steps;

    @Test
    public void userClickOnActiveLinks() throws InterruptedException {

        setDriver();
        homePage.dashboardLogin();
        payerSummerySteps.clickPayerSummery();
        activeLinks_steps.clickOnActiveLinks();

        String expectUrl = driver.getCurrentUrl();
        assertTrue(expectUrl.contains("ACTIVE"));
    }

}