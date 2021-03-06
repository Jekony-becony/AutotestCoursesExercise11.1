package org.example;// Generated by Selenium IDE

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AddthecontactpersonTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }

    @AfterEach
    public void tearDown() {
        LogEntries browserLogs = driver.manage().logs().get(LogType.BROWSER);
        List<LogEntry> allLogRows = browserLogs.getAll();
        if (allLogRows.size() > 0 ) {
            for(LogEntry info : allLogRows){

                System.out.println(info);
            }
        }
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

        addNewContactPersonPage.clickLangRu().setLangRu("Alya");
        addNewContactPersonPage.clickContactJobTitle().setContactJobTitle("Abobkin");
        driver.findElement(By.name("crm_contact[jobTitle]")).sendKeys(Keys.ENTER);
        System.out.println("Test ended sucessfully!");
    }
}
