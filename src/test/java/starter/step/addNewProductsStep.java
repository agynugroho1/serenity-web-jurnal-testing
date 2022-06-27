package starter.step;

import net.thucydides.core.annotations.Step;
import starter.pages.newProductDetailPage;
import starter.pages.newProductsPage;
import starter.pages.productsPage;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class addNewProductsStep {
    productsPage productspage;
    newProductsPage newproductspage;

    newProductDetailPage npdetail;

    @Step
    public void verifyProductsPage() {
        assertTrue(productspage.getHeaderProducts().equalsIgnoreCase("products"));
        assertTrue(productspage.isButtonActionIsAppear());
    }

    @Step
    public void clickButtonAction() {
        productspage.clickButtonAction();
    }

    @Step
    public void clickButtonNewProducts() {
        productspage.clickButtonNewProduct();
    }

    @Step
    public void verifyNewPageProduct() {
        assertTrue(newproductspage.getHeaderNewProducts().equalsIgnoreCase("Create New Product / Service"));
    }

    @Step
    public void fillFieldName(String name) {
        newproductspage.fillFieldName(name);
    }

    @Step
    public void fillFieldSKU(String sku) {
        newproductspage.fillFieldSKU(sku);
    }

    @Step
    public void fillCategorytoNewValue(String category) {
        newproductspage.fillCategorytoNewValue(category);
    }

    @Step
    public void fillUnittoPcs() {
        newproductspage.fillUnittoPcs();
    }

    @Step
    public void fillDescription(String desc) {
        newproductspage.fillDescription(desc);
    }

    @Step
    public void verifyCheckboxisActive(String type) {
        newproductspage.enableDisableCheckbox(type);
    }

    @Step
    public void fillFieldBUP(int nilai) {
        newproductspage.fillFieldBUP(nilai);
    }

    @Step
    public void fillBuyTax() {
        newproductspage.fillBuyTax();
    }

    @Step
    public void fillFieldSUP(int nilai) {
        newproductspage.fillFieldSUP(nilai);
    }

    @Step
    public void fillSellTax() {
        newproductspage.filSellTax();
    }

    @Step
    public void fillFieldStock(int nilai) {
        newproductspage.fillFieldStock(nilai);
    }

    @Step
    public void clickAddButton() {
        newproductspage.clickAddButton();
    }

    @Step
    public void verifyNewPageDetail() {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertTrue(npdetail.getHeaderProdutDetail().contains("Product Detail"));
        assertTrue(newProductsPage.nameProduct.equalsIgnoreCase(npdetail.getDetailName()));
        assertTrue(newProductsPage.skuProduct.equalsIgnoreCase(npdetail.getDetailSKU()));

        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
        int buyPriceVal = Integer.parseInt(newProductsPage.buyPriceProduct);
        int sellPriceVal = Integer.parseInt(newProductsPage.sellPriceProduct);

        assertTrue(kursIndonesia.format(buyPriceVal).equalsIgnoreCase(npdetail.getDetailBuyPrice()));
        assertTrue(kursIndonesia.format(sellPriceVal).equalsIgnoreCase(npdetail.getDetailSellPrice()));
        assertTrue(npdetail.getDetailStock().contains(newProductsPage.stockProduct));
    }
}
