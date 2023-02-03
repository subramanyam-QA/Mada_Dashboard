package HomePage;

import PayerSummeryPage.PayerSummery;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class HomePageSteps extends PageObject {
    DashboardHomePage dashboardHomePage;



    public void dashboardLogin(){
        dashboardHomePage.enterUserName("msubramanyam");
        dashboardHomePage.enterPassword("6)x8G9r$Z3ber^Dx");
        dashboardHomePage.clickOnLoginButton();

    }

}
