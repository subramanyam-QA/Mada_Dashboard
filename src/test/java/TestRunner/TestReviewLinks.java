package TestRunner;


import ChromeDriver.DriverFactory;
import Credentials.Base_URLs;
import FaileLinks.FailedUrl_Steps;
import HomePage.HomePageSteps;
import PayerSummeryPage.PayerSummerySteps;
import ReviewLinks.ReviewUrl_Steps;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.Credentials;

import static Credentials.Base_URLs.BaseUrl;

@RunWith(SerenityRunner.class)
public class TestReviewLinks extends DriverFactory {


    HomePageSteps homePage;


    PayerSummerySteps payerSummerySteps;
    ReviewUrl_Steps reviewUrl_steps;

    @Test
    public void userClickOnReviewLinks() throws InterruptedException {


        setDriver();
        homePage.dashboardLogin();
        payerSummerySteps.clickPayerSummery();
        reviewUrl_steps.setReviewUrl_action();

        String reviewUrl=driver.getCurrentUrl();
        Assert.assertTrue(reviewUrl.contains("REVIEW"));



    }

}