package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AutorizationPage {
    private WebDriver driver;
    @FindBy(id = "remember_me")
    private WebElement rememberMe;
    @FindBy(id = "prependedInput")
    private WebElement loginformUsername;
    @FindBy(id = "prependedInput2")
    private WebElement loginformPassword;
    @FindBy(id = "_submit")
    private WebElement login;
    public AutorizationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public AutorizationPage clickLogin() {
        assertTrue(login.isEnabled());
        login.click();
        return this;
    }
    public AutorizationPage clickLoginformUsername() {
        assertTrue(loginformUsername.isEnabled());
        loginformUsername.click();
        return this;
    }
    public AutorizationPage clickLoginformPassword() {
        assertTrue(loginformPassword.isEnabled());
        loginformPassword.click();
        return this;
    }
    public AutorizationPage clickRememberMe() {
        assertTrue(rememberMe.isEnabled());
        rememberMe.click();
        return this;
    }
    public AutorizationPage setLoginformUsername(CharSequence keys) {
        loginformUsername.sendKeys(keys);
        return this;
    }
    public AutorizationPage setLoginformPassword(CharSequence keys) {
        loginformPassword.sendKeys(keys);
        return this;
    }
}
