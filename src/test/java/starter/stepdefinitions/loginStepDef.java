package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.step.loginStep;

public class loginStepDef {
    @Steps
    loginStep loginsteps;

    @Given("I already on login page")
    public void iAlreadyOnLoginPage() {
        loginsteps.openLoginPage();
    }

    @When("I input my username")
    public void iInputMyUsername() {
        loginsteps.inputUsername();
    }

    @And("I input my password")
    public void iInputMyPassword() {
        loginsteps.inputPassword();
    }

    @And("I click login button")
    public void iClickLoginButton() {
        loginsteps.clickLoginButton();
    }

    @Given("I already logged in")
    public void iAlreadyLoggedIn() {
        loginsteps.openLoginPage();
        loginsteps.inputUsername();
        loginsteps.inputPassword();
        loginsteps.clickLoginButton();
    }
}
