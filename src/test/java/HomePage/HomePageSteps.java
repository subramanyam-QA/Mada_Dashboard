package HomePage;

import PayerSummeryPage.PayerSummery;
import net.thucydides.core.annotations.Step;

public class HomePageSteps {
    DashboardHomePage dashboardHomePage;


    @Step
    public void enterUserName(){
        dashboardHomePage.enterUserName("msubramanyam");

    }
    @Step
    public void enterPassword(){
        dashboardHomePage.enterPassword("6)x8G9r$Z3ber^Dx");
    }
    @Step
    public void clickOnLoginButton(){
        dashboardHomePage.clickOnLoginButton();

    }



}
