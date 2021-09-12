package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;

public class AddNewProjectPage {
    private WebDriver driver;
    @FindBy(linkText = "Создать проект")
    private WebElement createProject;
    @FindBy(name = "crm_project[name]")
    private WebElement projectName;
    @FindBy(name = "crm_project[businessUnit]")
    private WebElement crmProjectBusiness;
    @FindBy(name = "crm_project[curator]")
    private WebElement crmProjectCurator;
    @FindBy(name = "crm_project[rp]")
    private WebElement crmProjectRp;
    @FindBy(name = "crm_project[administrator]")
    private WebElement crmProjectAdministator;
    @FindBy(name = "crm_project[manager]")
    private WebElement crmProjectManager;
    public AddNewProjectPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public AddNewProjectPage clickCrmProjectCurator() {
        assertTrue(crmProjectCurator.isEnabled());
        crmProjectCurator.click();
        return this;
    }
    public AddNewProjectPage clickCrmProjectCuratorWebElement() {
        WebElement dropdown = crmProjectCurator;
        assertTrue(dropdown.findElement(By.xpath("//option[. = '0 -*/8']")).isEnabled());
        dropdown.findElement(By.xpath("//option[. = '0 -*/8']")).click();
        return this;
    }
    public AddNewProjectPage clickCrmProjectRp() {
        assertTrue(crmProjectRp.isEnabled());
        crmProjectRp.click();
        return this;
    }
    public AddNewProjectPage clickCrmProjectRpWebElement() {
        WebElement dropdown = crmProjectRp;
        assertTrue(dropdown.findElement(By.xpath("//option[. = '0 -*/8']")).isEnabled());
        dropdown.findElement(By.xpath("//option[. = '0 -*/8']")).click();
        return this;
    }
    public AddNewProjectPage clickProjectName() {
        assertTrue(projectName.isEnabled());
        projectName.click();
        return this;
    }
    public AddNewProjectPage clickCrmProjectBusiness() {
        assertTrue(crmProjectBusiness.isEnabled());
        crmProjectBusiness.click();
        return this;
    }
    public AddNewProjectPage clickCrmProjectBusinessWebElement() {
        WebElement dropdown = crmProjectBusiness;
        assertTrue(dropdown.findElement(By.xpath("//option[. = 'Research & Development']")).isEnabled());
        dropdown.findElement(By.xpath("//option[. = 'Research & Development']")).click();
        return this;
    }
    public AddNewProjectPage clickCrmProjectAdministator() {
        assertTrue(crmProjectAdministator.isEnabled());
        crmProjectAdministator.click();
        return this;
    }
    public AddNewProjectPage clickCrmProjectAdministatorWebElement() {
        WebElement dropdown = crmProjectAdministator;
        assertTrue(dropdown.findElement(By.xpath("//option[. = '0 -*/8']")).isEnabled());
        dropdown.findElement(By.xpath("//option[. = '0 -*/8']")).click();
        return this;
    }
    public AddNewProjectPage clickCrmProjectManager() {
        assertTrue(crmProjectManager.isEnabled());
        crmProjectManager.click();
        return this;
    }
    public AddNewProjectPage clickCrmProjectManagerWebElement() {
        WebElement dropdown = crmProjectManager;
        assertTrue(dropdown.findElement(By.xpath("//option[. = 'Антонов Дмитрий']")).isEnabled());
        dropdown.findElement(By.xpath("//option[. = 'Антонов Дмитрий']")).click();
        return this;
    }
    public AddNewProjectPage clickCreateProject() {
        assertTrue(createProject.isEnabled());
        createProject.click();
        return this;
    }
    public AddNewProjectPage setProjectName(CharSequence keys) {
        projectName.sendKeys(keys);
        return this;
    }

}
