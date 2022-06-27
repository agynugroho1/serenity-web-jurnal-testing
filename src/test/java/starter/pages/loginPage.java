package starter.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://my.jurnal.id/")
public class loginPage extends PageObject {
    @FindBy(id = "user_email")
    WebElement fieldEmail;

    @FindBy(id = "user_password")
    WebElement fieldPassword;

    @FindBy(id = "new-signin-button")
    WebElement buttonLogin;

    public void inputUsername() {
        fieldEmail.sendKeys("testertesterajaya10@gmail.com");
    }

    public void inputPassword() {
        fieldPassword.sendKeys("rp100perak");
    }

    public void clickLoginButton() {
        buttonLogin.click();
    }
}
