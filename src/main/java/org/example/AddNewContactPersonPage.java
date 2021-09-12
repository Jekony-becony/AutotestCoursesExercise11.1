package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;

public class AddNewContactPersonPage {
    private WebDriver driver;
    @FindBy(linkText = "Создать контактное лицо")
    private WebElement createContactPerson;
    @FindBy(name = "crm_contact[firstName]")
    private WebElement contactName;
    @FindBy(name = "crm_contact[lastName]")
    private WebElement contactLastName;
    @FindBy(name = "crm_contact[middleName]")
    private WebElement contactMiddleName;
    @FindBy(css = ".select2-chosen")
    private WebElement select2Chosen;
    @FindBy(css = ".lang-ru")
    private WebElement langRu;
    @FindBy(name = "crm_contact[jobTitle]")
    private WebElement contactJobTitle;
    public AddNewContactPersonPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public AddNewContactPersonPage clickContactMiddleName() {
        assertTrue(contactMiddleName.isEnabled());
        contactMiddleName.click();
        return this;
    }
    public AddNewContactPersonPage clickAndHoldSelect2Chosen() {
        WebElement element = select2Chosen;
        Actions builder = new Actions(driver);
        builder.moveToElement(element).clickAndHold();
        return this;
    }
    public AddNewContactPersonPage performSelect2Chosen() {
        WebElement element = select2Chosen;
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();
        return this;
    }
    public AddNewContactPersonPage clickContactName() {
        assertTrue(contactName.isEnabled());
        contactName.click();
        return this;
    }
    public AddNewContactPersonPage clickContactLastName() {
        assertTrue(contactLastName.isEnabled());
        contactLastName.click();
        return this;
    }
    public AddNewContactPersonPage clickCreateContactPerson() {
        assertTrue(createContactPerson.isEnabled());
        createContactPerson.click();
        return this;
    }
    public AddNewContactPersonPage clickContactJobTitle() {
        assertTrue(contactJobTitle.isEnabled());
        contactJobTitle.click();
        return this;
    }
    public AddNewContactPersonPage setContactJobTitle(CharSequence keys) {
        contactJobTitle.sendKeys(keys);
        return this;
    }
    public AddNewContactPersonPage clickLangRu() {
        assertTrue(langRu.isEnabled());
        langRu.click();
        return this;
    }
    public AddNewContactPersonPage setLangRu(CharSequence keys) {
        langRu.sendKeys(keys);
        return this;
    }
    public AddNewContactPersonPage setContactName(CharSequence keys) {
        contactName.sendKeys(keys);
        return this;
    }
    public AddNewContactPersonPage setContactLastName(CharSequence keys) {
        contactLastName.sendKeys(keys);
        return this;
    }
    public AddNewContactPersonPage setContactMiddleName(CharSequence keys) {
        contactMiddleName.sendKeys(keys);
        return this;
    }

}
