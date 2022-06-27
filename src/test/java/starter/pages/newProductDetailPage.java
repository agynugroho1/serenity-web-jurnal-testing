package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class newProductDetailPage extends PageObject {
    @FindBy(xpath = "//*[@id=\"product-new-react\"]/header/div/div[1]/div/h3")
    WebElement headerProductDetail;

    @FindBy(className = "product-name-detail")
    WebElement detailName;

    @FindBy(className = "product-code")
    WebElement detailSKU;

    @FindBy(xpath = "//*[@id=\"product-detail-react\"]/div[1]/div/div[2]/div[2]/div[1]/div/div[3]/span")
    WebElement detailBuyPrice;

    @FindBy(xpath = "//*[@id=\"product-detail-react\"]/div[1]/div/div[2]/div[2]/div[2]/div/div[3]/span")
    WebElement detailSellPrice;

    @FindBy(xpath = "//*[@id=\"product-detail-react\"]/div[1]/div/div[1]/div/div[5]/div[2]")
    WebElement detailStock;

    public String getHeaderProdutDetail() {
        return headerProductDetail.getText();
    }

    public String getDetailName() {
        return detailName.getText();
    }

    public String getDetailSKU() {
        return detailSKU.getText();
    }

    public String getDetailBuyPrice() {
        return detailBuyPrice.getText();
    }

    public String getDetailSellPrice() {
        return detailSellPrice.getText();
    }

    public String getDetailStock() {
        return detailStock.getText();
    }
}
