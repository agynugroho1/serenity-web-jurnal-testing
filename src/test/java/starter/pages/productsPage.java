package starter.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://my.jurnal.id/products/products_and_services")
public class productsPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"main-content\"]/header/div/div[1]/div/div/h2")
    WebElement headerProducts;

    @FindBy(xpath = "//*[@id=\"main-content\"]/header/div/div[2]/div/div/div[1]")
    WebElement buttonAction;

    @FindBy(xpath = "//*[@id=\"main-content\"]/header/div/div[2]/div/div/div[2]/div[1]/a")
    WebElement buttonNewProduct;

    public String getHeaderProducts() {
        return headerProducts.getText();
    }

    public Boolean isButtonActionIsAppear() {
        return buttonAction.isDisplayed();
    }

    public void clickButtonAction() {
        buttonAction.click();
    }

    public void clickButtonNewProduct() {
        buttonNewProduct.click();
    }

}
