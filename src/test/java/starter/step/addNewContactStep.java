package starter.step;

import net.thucydides.core.annotations.Step;
import starter.pages.contactDetail;
import starter.pages.contactPage;
import starter.pages.menuPage;
import starter.pages.newContactPage;

import static org.junit.Assert.assertTrue;

public class addNewContactStep {
    menuPage menupage;
    contactPage contactpage;
    newContactPage newcontactpage;
    contactDetail contactdetail;

    @Step
    public void clickContactMenu(String menu) {
        menupage.open();
        menupage.clickMenu(menu);
    }

    @Step
    public void verifyContactPage() {
        assertTrue(contactpage.getHeaderText().equalsIgnoreCase("contacts"));
        assertTrue(contactpage.isButtonNewContactAppear());
    }

    @Step
    public void clickAddNewContact() {
        contactpage.clickNewContact();
    }

    @Step
    public void verifyNewContactPage() {
        assertTrue(newcontactpage.getNewContactHeader().equalsIgnoreCase("create new contact"));
    }

    @Step
    public void fillContactName(String name) {
        newcontactpage.inputDisplayName(name);
    }

    @Step
    public void chooseCustomer() {
        newcontactpage.checklistCustomer();
    }

    @Step
    public void inputTitle(String title) {
        newcontactpage.inputTitle(title);
    }

    @Step
    public void inputFirstName(String fname) {
        newcontactpage.inputFirstName(fname);
    }

    @Step
    public void inputMiddleName(String mname) {
        newcontactpage.inputMiddleName(mname);
    }

    @Step
    public void inputLastName(String lname) {
        newcontactpage.inputLastName(lname);
    }

    @Step
    public void inputMobilePhone(String mphone) {
        newcontactpage.inputMobilePhone(mphone);
    }

    @Step
    public void inputIdentityType(String itype) {
        newcontactpage.inputIdentityType(itype);
    }

    @Step
    public void inputIdentityNumber(int inumber) {
        newcontactpage.inputIdentityNumber(inumber);
    }

    @Step
    public void inputEmail(String email) {
        newcontactpage.inputEmail(email);
    }

    @Step
    public void inputAnotherInfo(String aninfo) {
        newcontactpage.inputAnotherInfo(aninfo);
    }

    @Step
    public void inputCompanyName(String cname) {
        newcontactpage.inputCompanyName(cname);
    }

    @Step
    public void inputPhone(String nphone) {
        newcontactpage.inputPhone(nphone);
    }

    @Step
    public void inputFax(String nfax) {
        newcontactpage.inputFax(nfax);
    }

    @Step
    public void inputNpwp(String nnpwp) {
        newcontactpage.inputNpwp(nnpwp);
    }

    @Step
    public void inputBillingAddress(String bildres) {
        newcontactpage.inputBillingAddress(bildres);
    }

    @Step
    public void inputShippingAddress(String shipdres) {
        newcontactpage.inputShippingAddress(shipdres);
    }

    @Step
    public void inputBankName(String bname) {
        newcontactpage.inputBankName(bname);
    }

    @Step
    public void inputBankBranch(String brname) {
        newcontactpage.inputBankBranch(brname);
    }

    @Step
    public void inputBankHolderName(String bhldname) {
        newcontactpage.inputBankHolderName(bhldname);
    }

    @Step
    public void inputAccountNumber(int anumber) {
        newcontactpage.inputAccountNumber(anumber);
    }

    @Step
    public void clickButtonAdd() {
        newcontactpage.clickButtonAdd();
    }


    @Step
    public void verifyContactCreated(String ExpectedName) {
        String actualName = contactdetail.getContactName();
        assertTrue(actualName.contains(ExpectedName));
        String type = contactdetail.getCustomerType();
        assertTrue(type.equalsIgnoreCase("customer"));
        assertTrue(newContactPage.emailTf.equalsIgnoreCase(contactdetail.getEmailContact()));
        assertTrue(newContactPage.mPhoneTf.equalsIgnoreCase(contactdetail.getmPhoneContact()));
    }

}
