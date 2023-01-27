package HomePage;

import net.serenitybdd.core.pages.PageObject;


public class DashboardHomePage extends PageObject {

    public void enterUserName(String username) {

        $("#user_username").sendKeys(username);
    }

    public void enterPassword(String password) {

        $("#user_password").sendKeys(password);
    }
//
    public void clickOnLoginButton() {
        $(".submit").click();

    }

}
