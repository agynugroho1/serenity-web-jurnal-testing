package starter.step;

import net.thucydides.core.annotations.Step;
import starter.pages.loginPage;

public class loginStep {

    loginPage loginpage;

    @Step
    public void openLoginPage() {
        loginpage.open();
    }

    @Step
    public void inputUsername() {
        loginpage.inputUsername();
    }

    @Step
    public void inputPassword() {
        loginpage.inputPassword();
    }

    @Step
    public void clickLoginButton() {
        loginpage.clickLoginButton();
    }

}
