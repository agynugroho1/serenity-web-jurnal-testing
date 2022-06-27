package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.step.addNewProductsStep;

public class AddProductsStepdef {

    @Steps
    addNewProductsStep addNewProducts;

    @Then("Products page appear")
    public void productsPageAppear() {
        addNewProducts.verifyProductsPage();
    }

    @When("I click button action")
    public void iClickButtonAction() {
        addNewProducts.clickButtonAction();
    }

    @And("I click new products")
    public void iClickNewProducts() {
        addNewProducts.clickButtonNewProducts();
    }

    @Then("New products page appear")
    public void newProductsPageAppear() {
        addNewProducts.verifyNewPageProduct();
    }

    @When("I fill product name with {string}")
    public void iFillProductNameWith(String name) {
        addNewProducts.fillFieldName(name + System.currentTimeMillis());
    }

    @And("I fill product sku with {string}")
    public void iFillProductSkuWith(String sku) {
        addNewProducts.fillFieldSKU(sku + System.currentTimeMillis());
    }

    @And("I fill product category to {string}")
    public void iFillProductCategoryToNewValue(String category) {
        addNewProducts.fillCategorytoNewValue(category + System.currentTimeMillis());
    }

    @And("I fill type of unit product to pcs")
    public void iFillTypeOfUnitProductToPcs() {
        addNewProducts.fillUnittoPcs();
    }

    @And("I fill description with {string}")
    public void iFillDescriptionWith(String desc) {
        addNewProducts.fillDescription(desc);
    }

    @And("I verify checkbox on I {string} This Item is Active \\(disable and enable)")
    public void iVerifyCheckboxOnIsActiveDisableAndEnable(String type) {
        addNewProducts.verifyCheckboxisActive(type);
    }

    @And("I fill {string} Unit Price with {int}")
    public void iFillUnitPriceWith(String arg0, int nilai) {
        if (arg0.equalsIgnoreCase("buy")) {
            addNewProducts.fillFieldBUP(nilai);
        } else {
            addNewProducts.fillFieldSUP(nilai);
        }
    }

    @And("I fill Default {string} Tax with PPN")
    public void iFillDefaultTaxWithPPN(String arg0) {
        if (arg0.equalsIgnoreCase("buy")) {
            addNewProducts.fillBuyTax();
        } else {
            addNewProducts.fillSellTax();
        }
    }

    @And("I fill Stock Minimum with {int}")
    public void iFillStockMinimumWith(int nilai) {
        addNewProducts.fillFieldStock(nilai);
    }

    @And("I click button create new product")
    public void iClickButtonCreateNewProduct() {
        addNewProducts.clickAddButton();
    }

    @Then("Product Detail page appear")
    public void productDetailPageAppear() {
        addNewProducts.verifyNewPageDetail();
    }
}
