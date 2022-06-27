package starter.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://my.jurnal.id/products/new")
public class newProductsPage extends PageObject {

    public static String nameProduct, skuProduct, buyPriceProduct, sellPriceProduct, stockProduct;

    @FindBy(xpath = "//*[@id=\"main-content\"]/header/div/div[1]/h1")
    WebElement headerNewProduct;

    @FindBy(id = "name")
    WebElement fieldName;

    @FindBy(xpath = "//*[@id=\"product-new-react\"]/div/div/div/div/div/div[1]/div[3]/div[2]/input")
    WebElement fieldSKU;

    @FindBy(xpath = "//*[@id=\"product-new-react\"]/div/div/div/div/div/div[1]/div[6]/div[2]/textarea")
    WebElement fieldDescription;

    @FindBy(xpath = "//*[@id=\"react-select-2--value\"]/div[2]/input")
    WebElement inputCategory;

    @FindBy(xpath = "//*[@id=\"product-new-react\"]/div/div/div/div/div/div[1]/div[5]/div[2]/div/div/div/span[3]/span")
    WebElement ddownUnit;
    @FindBy(xpath = "//*[text()=\"Pcs\"]")
    WebElement unitPcs;

    @FindBy(xpath = "//*[@id=\"buy-panel\"]")
    WebElement checkBoxBuy;

    @FindBy(xpath = "//*[@id=\"product-new-react\"]/div/div/div/div/div/div[1]/div[8]/div/div/div[1]/div/div[1]/div/div/div[2]/div/div/div[1]/h4/div")
    WebElement clickFieldBUP;
    @FindBy(name = "priceProductBuy")
    WebElement fieldBUP;

    @FindBy(xpath = "//*[@id=\"product-new-react\"]/div/div/div/div/div/div[1]/div[8]/div/div/div[1]/div/div[1]/div/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/span[2]/span")
    WebElement ddownTaxBuy;
    @FindBy(xpath = "//*[text()=\"PPN\"]")
    WebElement Tax;

    @FindBy(xpath = "//*[@id=\"sell-panel\"]")
    WebElement checkBoxSell;

    @FindBy(xpath = "//*[@id=\"product-new-react\"]/div/div/div/div/div/div[1]/div[8]/div/div/div[1]/div/div[2]/div/div/div[2]/div/div/div[1]/h4/div")
    WebElement clickFieldSUP;
    @FindBy(name = "priceProductSale")
    WebElement fieldSUP;

    @FindBy(xpath = "//*[@id=\"track-panel\"]")
    WebElement checkBoxStock;

    @FindBy(xpath = "//*[@id=\"product-new-react\"]/div/div/div/div/div/div[1]/div[8]/div/div/div[1]/div/div[3]/div/div/div[2]/div/div/div[1]/h4/div")
    WebElement clickFieldStock;

    @FindBy(name = "priceInventoryAccount")
    WebElement fieldStock;

    @FindBy(xpath = "//*[@id=\"product-new-react\"]/div/div/div/div/div/div[1]/div[9]/div/button[1]")
    WebElement buttonAddproducts;

    @FindBy(xpath = "//*[@id=\"react-select-8--value\"]/div[2]/input")
    WebElement taxClick;

    public String getHeaderNewProducts() {
        return headerNewProduct.getText();
    }

    public void fillFieldName(String name) {
        fieldName.sendKeys(name);
        nameProduct = name;
    }

    public void fillFieldSKU(String sku) {
        fieldSKU.sendKeys(sku);
        skuProduct = sku;
    }

    public void fillCategorytoNewValue(String category) {
        inputCategory.sendKeys(category);
        WebElement enterCategory = getDriver().findElement(By.xpath("//*[text()=\"+ " + category + "(new)\"]"));
        enterCategory.click();
    }

    public void fillUnittoPcs() {
        ddownUnit.click();
        unitPcs.click();
    }

    public void fillDescription(String desc) {
        fieldDescription.sendKeys(desc);
    }

    public void enableDisableCheckbox(String type) {
        if (type.equalsIgnoreCase("buy")) {
            checkBoxBuy.click();

            checkBoxBuy.click();
        } else if (type.equalsIgnoreCase("sell")) {
            checkBoxSell.click();

            checkBoxSell.click();
        } else if (type.contains("Stock")) {
            checkBoxStock.click();

            checkBoxStock.click();

            checkBoxStock.click();
        }
    }

    public void fillFieldBUP(int nilai) {
        clickFieldBUP.click();
        fieldBUP.sendKeys(String.valueOf(nilai));
        buyPriceProduct = String.valueOf(nilai);
    }

    public void fillFieldSUP(int nilai) {
        clickFieldSUP.click();
        fieldSUP.sendKeys(String.valueOf(nilai));
        sellPriceProduct = String.valueOf(nilai);
    }

    public void fillBuyTax() {
        ddownTaxBuy.click();
        Tax.click();
    }

    public void filSellTax() {
        taxClick.sendKeys(Keys.ARROW_DOWN);
        taxClick.sendKeys(Keys.ENTER);
    }

    public void fillFieldStock(int nilai) {
        clickFieldStock.click();
        fieldStock.sendKeys(String.valueOf(nilai));
        stockProduct = String.valueOf(nilai);
    }

    public void clickAddButton() {
        buttonAddproducts.click();
    }

}
