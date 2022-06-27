package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.step.addNewContactStep;

public class AddContactStepdef {

    @Steps
    addNewContactStep addNewContact;

    @When("I click {string} menu")
    public void iClickContactMenu(String menu) {
        addNewContact.clickContactMenu(menu);
    }

    @Then("Contact page appear")
    public void contactPageAppear() {
        addNewContact.verifyContactPage();
    }

    @When("I click new contact")
    public void iClickNewContact() {
        addNewContact.clickAddNewContact();
    }

    @Then("create new contact page appear")
    public void createNewContactPageAppear() {
        addNewContact.verifyNewContactPage();
    }

    @When("I fill name with {string}")
    public void iFillNameWith(String name) {
        addNewContact.fillContactName(name + System.currentTimeMillis());
    }

    @And("I choose contact type as customer")
    public void iChooseContactTypeAsCustomer() {
        addNewContact.chooseCustomer();
    }


    @And("I input title name with {string}")
    public void iInputTitleNameWith(String tittle) {
        addNewContact.inputTitle(tittle);
    }

    @And("I input first name with {string}")
    public void iInputFirstNameWith(String fname) {
        addNewContact.inputFirstName(fname);
    }

    @And("I input midle name with {string}")
    public void iInputMidleNameWith(String mname) {
        addNewContact.inputMiddleName(mname);
    }

    @And("I input last name with {string}")
    public void iInputLastNameWith(String lname) {
        addNewContact.inputLastName(lname);
    }

    @And("I input number handphone with {string}")
    public void iInputNumberHandphoneWith(String mphone) {
        addNewContact.inputMobilePhone(mphone);
    }

    @And("I input identity type with {string}")
    public void iInputIdentityTypeWith(String itype) {
        addNewContact.inputIdentityType(itype);
    }

    @And("I input identity number with {int}")
    public void iInputIdentityNumberWith(int inumber) {
        addNewContact.inputIdentityNumber(inumber);
    }

    @And("I input email with {string}")
    public void iInputEmailWith(String email) {
        addNewContact.inputEmail(email);
    }

    @And("I input another info with {string}")
    public void iInputAnotherInfoWith(String aninfo) {
        addNewContact.inputAnotherInfo(aninfo);
    }

    @And("I input number telephone with {string}")
    public void iInputNumberTelephoneWith(String nphone) {
        addNewContact.inputPhone(nphone);
    }

    @And("I input fax with {string}")
    public void iInputFaxWith(String nfax) {
        addNewContact.inputFax(nfax);
    }

    @And("I input npwp with {string}")
    public void iInputNpwpWith(String nnpwp) {
        addNewContact.inputNpwp(nnpwp);
    }

    @And("I input billing address with {string}")
    public void iInputBillingAddressWith(String bildres) {
        addNewContact.inputBillingAddress(bildres);
    }

    @And("I input shipping adres with {string}")
    public void iInputShippingAdresWith(String shipdres) {
        addNewContact.inputShippingAddress(shipdres);
    }

    @And("I input bank name with {string}")
    public void iInputBankNameWith(String bname) {
        addNewContact.inputBankName(bname);
    }

    @And("I input bank branch with {string}")
    public void iInputBankBranchWith(String brname) {
        addNewContact.inputBankBranch(brname);
    }

    @And("I input bank holder name with {string}")
    public void iInputBankHolderNameWith(String bhldname) {
        addNewContact.inputBankHolderName(bhldname);
    }

    @And("I input account number with {int}")
    public void iInputAccountNumberWith(int anumber) {
        addNewContact.inputAccountNumber(anumber);
    }

    @And("I click add button")
    public void iClickAddButton() {
        addNewContact.clickButtonAdd();
    }

    @Then("Contact with name {string} is created")
    public void contactWithNameIsCreated(String name) {
        addNewContact.verifyContactCreated(name);
    }

    @And("I input company name {string}")
    public void iInputCompanyName(String cname) {
        addNewContact.inputCompanyName(cname);
    }
}
