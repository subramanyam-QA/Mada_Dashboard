package LandingPage;

import net.serenitybdd.core.pages.PageObject;

public class LandingPageSteps extends PageObject {
    LandingPageActions landingPageActions;
    //LandingPageElements landingPageElements;



    public void dashboardLogin(){
        landingPageActions.enterUserName("msubramanyam");
        landingPageActions.enterPassword("6)x8G9r$Z3ber^Dx");
        landingPageActions.clickOnLoginButton();

    }

}
