package TestRunner;


import ChromeDriver.DriverFactory;
import HomePage.HomePageSteps;
import PayerSummeryPage.PayerSummerySteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class TestLogin extends DriverFactory {


   HomePageSteps homePage;
    PayerSummerySteps payerSummerySteps;

    @Test
    public void userLoginHomePage() throws InterruptedException {

        setDriver();
        homePage.dashboardLogin();


        String expectTitle = driver.getTitle();
        String actualTitle = "MADA Dashboard";
        Assert.assertEquals(expectTitle, actualTitle);


        payerSummerySteps.clickPayerSummery();
        String actualSummary  = driver.getCurrentUrl();
        Assert.assertTrue(actualSummary.contains("payer_summary"));



    }

}