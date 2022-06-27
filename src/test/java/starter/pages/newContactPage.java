package starter.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://my.jurnal.id/contacts/new")
public class newContactPage extends PageObject {

    public static String emailTf, mPhoneTf;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[2]/div/div/span[2]")
    WebElement newContactHeader;

    @FindBy(id = "display_name")
    WebElement displayName;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[3]/div[1]/div/div/div[3]/div[2]/label[1]/span")
    WebElement checkboxCustomer;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[3]/div[2]/div/div/div[2]/div[1]/div/div/span/span")
    WebElement dropdownTitle;

    @FindBy(id = "first_name")
    WebElement firstName;

    @FindBy(id = "middle_name")
    WebElement middleName;

    @FindBy(id = "last_name")
    WebElement lastName;

    @FindBy(id = "mobile")
    WebElement mobilePhone;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[3]/div[2]/div/div/div[4]/div[1]/div/div/span/span")
    WebElement dropdownIdentityType;

    @FindBy(id = "identity_number")
    WebElement identityNumber;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[3]/div[2]/div/div/div[5]/div[2]/label/ul/input")
    WebElement email;

    @FindBy(id = "other_detail")
    WebElement anotherInfo;

    @FindBy(id = "associate_company")
    WebElement companyName;

    @FindBy(id = "phone")
    WebElement phone;

    @FindBy(id = "fax")
    WebElement fax;

    @FindBy(id = "tax_no")
    WebElement npwp;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[3]/div[2]/div/div/div[11]/div[1]/textarea")
    WebElement billingAddress;

    @FindBy(id = "address")
    WebElement shippingAddress;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[3]/div[3]/div/div/div/i")
    WebElement ddown;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[3]/div[3]/div/div/div[3]/div/div/div/span/span")
    WebElement ddownBankName;

    @FindBy(xpath = "//input[@placeholder=\"Bank Branch\"]")
    WebElement bankBranch;

    @FindBy(xpath = "//input[@placeholder=\"Bank Holder Name\"]")
    WebElement bankHolderName;

    @FindBy(xpath = "//input[@placeholder=\"Account Number\"]")
    WebElement accountNumber;

    @FindBy(xpath = "//*[@id=\"main-content\"]/div[3]/div[5]/div/button[1]")
    WebElement buttonAdd;

    public String getNewContactHeader() {
        return newContactHeader.getText();
    }

    public void inputDisplayName(String name) {
        displayName.sendKeys(name);
    }

    public void checklistCustomer() {
        checkboxCustomer.click();
    }

    public void inputTitle(String title) {
        dropdownTitle.click();
        WebElement titleName = getDriver().findElement(By.xpath("//*[text()=\"" + title + "\"]"));
        titleName.click();
    }

    public void inputFirstName(String fname) {
        firstName.sendKeys(fname);
    }

    public void inputMiddleName(String mname) {
        middleName.sendKeys(mname);
    }

    public void inputLastName(String lname) {
        lastName.sendKeys(lname);
    }

    public void inputMobilePhone(String mphone) {
        mobilePhone.sendKeys(mphone);
        mPhoneTf = mphone;
    }

    public void inputIdentityType(String itype) {
        dropdownIdentityType.click();
        WebElement identityType = getDriver().findElement(By.xpath("//*[text()=\"" + itype + "\"]"));
        identityType.click();
    }

    public void inputIdentityNumber(int inumber) {
        identityNumber.sendKeys(String.valueOf(inumber));
    }

    public void inputEmail(String email) {
        this.email.sendKeys(email);
        emailTf = email;
    }

    public void inputAnotherInfo(String aninfo) {
        anotherInfo.sendKeys(aninfo);
    }

    public void inputCompanyName(String cname) {
        companyName.sendKeys(cname);
    }

    public void inputPhone(String nphone) {
        phone.sendKeys(nphone);
    }

    public void inputFax(String nfax) {
        fax.sendKeys(nfax);
    }

    public void inputNpwp(String nnpwp) {
        npwp.sendKeys(nnpwp);
    }

    public void inputBillingAddress(String bildres) {
        billingAddress.sendKeys(bildres);
    }

    public void inputShippingAddress(String shipdres) {
        shippingAddress.sendKeys(shipdres);
        ddown.click();
    }

    public void inputBankName(String bname) {
        ddownBankName.click();
        WebElement bankName = getDriver().findElement(By.xpath("//*[text()=\"" + bname + "\"]"));
        bankName.click();
    }

    public void inputBankBranch(String brname) {
        bankBranch.sendKeys(brname);
    }

    public void inputBankHolderName(String bhldname) {
        bankHolderName.sendKeys(bhldname);
    }

    public void inputAccountNumber(int anumber) {
        accountNumber.sendKeys(String.valueOf(anumber));
    }

    public void clickButtonAdd() {
        buttonAdd.click();
    }
}
