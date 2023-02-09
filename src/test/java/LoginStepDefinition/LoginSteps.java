package LoginStepDefinition;

import ChromeDriver.DriverFactory;
import LandingPage.LandingPageActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends DriverFactory {


    LandingPageActions landingPageActions;
    @Given("User is on Dashboard Lading page")
    public void user_is_on_dashboard_lading_page() {
        setDriver();
        landingPageActions.open("http://mada-dashboard-qa.decisionresourcesgroup.com/users/sign_in");

    }
    @When("User enter the Valid User name")
    public void user_enter_the_valid_user_name() {
        landingPageActions.enterUserName("msubramanyam");

    }
    @When("User enter the  valid password")
    public void user_enter_the_valid_password() {
        landingPageActions.enterPassword("6)x8G9r$Z3ber^Dx");

    }
    @When("User click on Login button")
    public void user_click_on_login_button() {
        landingPageActions.clickOnLoginButton();
    }
    @Then("User Navigate to HomePage")
    public void user_navigate_to_home_page() {


    }

}
