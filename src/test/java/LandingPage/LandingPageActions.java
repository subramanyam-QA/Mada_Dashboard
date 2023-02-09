package LandingPage;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.steps.UIInteractions;
import org.openqa.selenium.By;

//import static LandingPage.LandingPageElements.userName;


public class LandingPageActions extends UIInteractions {

   // LandingPageElements landingPageElements;


    public void enterUserName(String username ) {
      $("#user_username").sendKeys(username);


    }

    public void enterPassword(String userPassword) {

        $("#user_password").sendKeys(userPassword);


    }

    public void clickOnLoginButton() {
        $(".submit").click();



    }

}
