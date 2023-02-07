package PayerSummeryPage;

import ChromeDriver.DriverFactory;
import LandingPage.LandingPageSteps;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.junit.Before;

public class PayerSummerySteps extends PageObject {
    DriverFactory driverFactory;
    LandingPageSteps landingPageSteps;

    PayerSummery payerSummery;

    public void clickOnBusinessName(String business) {
        payerSummery.clickOnPayer(business);
    }


}
