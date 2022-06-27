package starter.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://my.jurnal.id/contacts")
public class contactPage extends PageObject {
    @FindBy(xpath = "//*[@id=\"main-content\"]/div[2]/div/div[1]")
    WebElement contactsHeader;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[2]/div/div[2]/button")
    WebElement newContactButton;

    public String getHeaderText() {
        return contactsHeader.getText();
    }

    public Boolean isButtonNewContactAppear() {
        return newContactButton.isDisplayed();
    }

    public void clickNewContact() {
        newContactButton.click();
    }

}
