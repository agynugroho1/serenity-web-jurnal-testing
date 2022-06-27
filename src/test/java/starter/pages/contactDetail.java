package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class contactDetail extends PageObject {

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[4]/div[1]/div[1]/span[1]")
    WebElement contactName;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[4]/div[1]/div[1]/span[3]")
    WebElement contactType;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[4]/div[3]/div[2]/span[5]")
    WebElement emailDetail;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[4]/div[3]/div[2]/span[7]")
    WebElement mPhoneDetail;

    public String getContactName() {
        return contactName.getText();
    }

    public String getCustomerType() {
        return contactType.getText();
    }

    public String getEmailContact() {
        return emailDetail.getText();
    }

    public String getmPhoneContact() {
        return mPhoneDetail.getText();
    }
}