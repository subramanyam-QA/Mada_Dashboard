package TestRunner;


import ChromeDriver.DriverFactory;
import Credentials.BaseClass;
import HomePage.HomePageSteps;
import PayerSummeryPage.PayerSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static Credentials.BaseClass.BaseUrl;

@RunWith(SerenityRunner.class)
public class TestLogin extends DriverFactory {

    BaseClass baseClass;
    @Steps
    HomePageSteps homePage;

    @Steps
    PayerSteps payerSteps;

    @Test
    public void userLoginHomePage() {
        driver.manage().window().maximize();
        driver.get(BaseUrl);


        homePage.enterUserName();
        homePage.enterPassword();
        homePage.clickOnLoginButton();
        String expectTitle = driver.getTitle();
        System.out.println(expectTitle);
        String actualTitle = "MADA Dashboard";
        Assert.assertEquals(expectTitle, actualTitle);

//        payerSteps.clickPayerSummery();
//        payerSteps.clickOnActiveLink();

       // System.out.println(expectStatus);


    }


    private class PayerSummery {
    }
}
