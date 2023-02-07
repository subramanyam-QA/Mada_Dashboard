package TestRunner;

import ChromeDriver.DriverFactory;
import LandingPage.LandingPageSteps;
import PayerSummeryPage.PayerSummerySteps;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import summerySection.ActiveLink_Steps;
import summerySection.BlockedLink_Steps;
import summerySection.FailedLink_Steps;
import summerySection.ReviewLink_Steps;

import static org.junit.Assert.assertTrue;
@RunWith(SerenityRunner.class)
public class TestSummeryMetricsLink extends DriverFactory{
    LandingPageSteps landingPageSteps;


    PayerSummerySteps payerSummerySteps;

    ActiveLink_Steps activeLink_steps;
    BlockedLink_Steps blockedLink_steps;
    FailedLink_Steps failedLinkSteps;
    ReviewLink_Steps reviewLink_steps;


   @Before
    public void login(){
        setDriver();
       landingPageSteps.dashboardLogin();
        payerSummerySteps.clickOnBusinessName("Payer Summary");
    }
    @Test
    public void userClickOnActiveLinks() throws InterruptedException {
        payerSummerySteps.clickOnBusinessName("Payer Summary");
        activeLink_steps.clickOnActiveLinks();
        String expectUrl = driver.getCurrentUrl();
        Serenity.reportThat("User should able to click on the ACTIVE link",
                () ->assertTrue(expectUrl.contains("ACTIVE")));
        activeLink_steps.verfiyStatusInTable("ACTIVE");
    }
    @Test
    public void userClickOnBlockedLinks() throws InterruptedException {
        blockedLink_steps.clickBlockedLinks();

        String expectUrl = driver.getCurrentUrl();
        Serenity.reportThat("User should able to click on the ACTIVE link",
                () ->assertTrue(expectUrl.contains("BLOCKED")));
        activeLink_steps.verfiyStatusInTable("BLOCKED");

    }
    @Test
    public void userClickOnFailedLinks() throws InterruptedException {
        failedLinkSteps.setFailedUrl_actions();
        String expectUrl = driver.getCurrentUrl();
        Serenity.reportThat("User should able to click on the ACTIVE link",
                () ->assertTrue(expectUrl.contains("FAILED")));
        activeLink_steps.verfiyStatusInTable("FAILED");

    }

    @Test
    public void userClickOnReviewLinks() throws InterruptedException {
        reviewLink_steps.setReviewUrl_action();
        String expectUrl = driver.getCurrentUrl();
        Serenity.reportThat("User should able to click on the ACTIVE link",
                () ->assertTrue(expectUrl.contains("REVIEW")));
        activeLink_steps.verfiyStatusInTable("REVIEW");
    }



}
