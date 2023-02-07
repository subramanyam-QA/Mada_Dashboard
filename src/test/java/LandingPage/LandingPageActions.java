package LandingPage;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.steps.UIInteractions;
import org.openqa.selenium.By;

import static LandingPage.LandingPageElements.userName;


public class LandingPageActions extends UIInteractions {

    LandingPageElements landingPageElements;


    public void enterUserName(String username ) {
      $("#user_username").sendKeys(username);

       // $(userName).sendKeys(username);
     //  $(landingPageElements.username).sendKeys(landingPageElements.enterUserName());
      //  find(By.cssSelector(username)).sendKeys(username);
    }

    public void enterPassword(String userPassword) {

        $("#user_password").sendKeys(userPassword);

        //$(userPassword).sendKeys(userPassword);
       // find(By.cssSelector(userPassword)).sendKeys(userPassword);
    }

    public void clickOnLoginButton() {
        $(".submit").click();

        //$(loginButton).click();
        //find(By.className(loginButton)).click();

    }

}
