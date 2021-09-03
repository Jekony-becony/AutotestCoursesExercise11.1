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
        driver.findElement(By.id("prependedInput")).click();
        driver.findElement(By.id("prependedInput")).sendKeys("Applanatest1");
        driver.findElement(By.id("prependedInput2")).click();
        driver.findElement(By.id("prependedInput2")).sendKeys("Student2020!");
        driver.findElement(By.id("remember_me")).click();
        driver.findElement(By.id("_submit")).click();
        driver.manage().window().setSize(new Dimension(1536, 864));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Создать контактное лицо")).click();
        driver.findElement(By.name("crm_contact[lastName]")).click();
        driver.findElement(By.name("crm_contact[lastName]")).sendKeys("Ivanenko");
        driver.findElement(By.name("crm_contact[firstName]")).click();
        driver.findElement(By.name("crm_contact[firstName]")).sendKeys("Olexandr");
        driver.findElement(By.name("crm_contact[middleName]")).click();
        driver.findElement(By.name("crm_contact[middleName]")).sendKeys("Dmitrovich");

        {
            WebElement element = driver.findElement(By.cssSelector(".select2-chosen"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        {
            WebElement element = driver.findElement(By.cssSelector(".select2-chosen"));
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            Actions builder = new Actions(driver);
            builder.moveToElement(element).clickAndHold().perform();
        }
        {
            WebElement element = driver.findElement(By.id("select2-drop-mask"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).release().perform();
        }

        driver.findElement(By.cssSelector(".lang-ru")).click();
        driver.findElement(By.cssSelector(".lang-ru")).sendKeys("Alya");
        driver.findElement(By.name("crm_contact[jobTitle]")).click();
        driver.findElement(By.name("crm_contact[jobTitle]")).sendKeys("Abobkin");
        driver.findElement(By.name("crm_contact[jobTitle]")).sendKeys(Keys.ENTER);
        System.out.println("Test ended sucessfully!");
    }
}
