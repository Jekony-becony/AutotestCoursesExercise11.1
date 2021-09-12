package org.example;// Generated by Selenium IDE

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class AddthecontactpersonTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void main() {
        driver.get("https://crm.geekbrains.space/contact/");
        AutorizationPage autorizationPage = new AutorizationPage(driver);
        autorizationPage.clickLoginformUsername().setLoginformUsername("Applanatest1");
        autorizationPage.clickLoginformPassword().setLoginformPassword("Student2020!");
        autorizationPage.clickRememberMe();
        autorizationPage.clickLogin();
        driver.manage().window().setSize(new Dimension(1536, 864));

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        AddNewContactPersonPage addNewContactPersonPage = new AddNewContactPersonPage(driver);
        addNewContactPersonPage.clickCreateContactPerson();
        addNewContactPersonPage.clickContactName().setContactName("Olexandr");
        addNewContactPersonPage.clickContactLastName().setContactLastName("Ivanenko");
        addNewContactPersonPage.clickContactMiddleName().setContactMiddleName("Dmitrovich");
        addNewContactPersonPage.performSelect2Chosen();
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        addNewContactPersonPage.clickAndHoldSelect2Chosen().performSelect2Chosen();
        {
            WebElement element = driver.findElement(By.id("select2-drop-mask"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).release().perform();
        }
        addNewContactPersonPage.clickLangRu().setLangRu("Alya");
        addNewContactPersonPage.clickContactJobTitle().setContactJobTitle("Abobkin");
        driver.findElement(By.name("crm_contact[jobTitle]")).sendKeys(Keys.ENTER);
        System.out.println("Test ended sucessfully!");
    }
}
