package LoginStepDefination;

import ChromeDriver.DriverFactory;
import HomePage.DashboardHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends DriverFactory {


    DashboardHomePage dashboardHomePage;
    @Given("User is on Dashboard Lading page")
    public void user_is_on_dashboard_lading_page() {
        dashboardHomePage.open();

    }
    @When("User enter the Valid User name")
    public void user_enter_the_valid_user_name() {
        dashboardHomePage.enterUserName("msubramanyam");

    }
    @When("User enter the  valid password")
    public void user_enter_the_valid_password() {
        dashboardHomePage.enterPassword("6)x8G9r$Z3ber^Dx");

    }
    @When("User click on Login button")
    public void user_click_on_login_button() {
    dashboardHomePage.clickOnLoginButton();
    }
    @Then("User Navigate to HomePage")
    public void user_navigate_to_home_page() {


    }

}
