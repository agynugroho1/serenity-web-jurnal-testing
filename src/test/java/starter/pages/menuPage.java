package starter.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://my.jurnal.id/")
public class menuPage extends PageObject {
    @FindBy(xpath = "//*[@id=\"vnav-contacts-link\"]")
    WebElement contactMenu;

    @FindBy(xpath = "//*[@id=\"vnav-inventory-link\"]")
    WebElement productsMenu;

    public void clickMenu(String menu) {
        if (menu.equalsIgnoreCase("contacts")) {
            contactMenu.click();
        } else {
            productsMenu.click();
        }
    }

}
