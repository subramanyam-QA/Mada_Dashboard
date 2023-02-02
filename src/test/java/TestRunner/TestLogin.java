package TestRunner;


import ChromeDriver.DriverFactory;
import Credentials.Base_URLs;
import HomePage.HomePageSteps;
//import PayerSummeryPage.PayerSteps;
import PayerSummeryPage.PayerSummerySteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.Credentials;

import static Credentials.Base_URLs.BaseUrl;

@RunWith(SerenityRunner.class)
public class TestLogin extends DriverFactory {

    Base_URLs baseClass;
    @Steps
    HomePageSteps homePage;

    @Steps
    PayerSummerySteps payerSummerySteps;

    @Test
    public void userLoginHomePage() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get(BaseUrl);
        Credentials credentials;



        homePage.enterUserName();
        homePage.enterPassword();
        homePage.clickOnLoginButton();

        String expectTitle = driver.getTitle();
        System.out.println(expectTitle);
        String actualTitle = "MADA Dashboard";
        Assert.assertEquals(expectTitle, actualTitle);


        payerSummerySteps.clickPayerSummery();
//       String PaSummaryAct = driver.getCurrentUrl();
//       String PaSummaryEXPT = "http://mada-dashboard.decisionresourcesgroup.com/dashboard/payer_summary?payerFilter=All&uatDocCountFilter=All";
//       Assert.assertEquals(PaSummaryEXPT,PaSummaryAct);
        payerSummerySteps.clickOnActiveLink();
payerSummerySteps.clickBlockedLinks();
        payerSummerySteps.clickBlockedLinks();
        System.out.println("Automation");
        System.out.println("Automation");



    }
}