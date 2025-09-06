package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmployeeFormPage {
    WebDriver driver;

    // Constructor
    public EmployeeFormPage(WebDriver driver) {
        this.driver = driver;
    }

    // Updated Locators to match HTML
    By empIdField = By.id("empId");       // changed from empid → empId
    By empNameField = By.id("empName");   // changed from empname → empName
    By emailField = By.id("email");       // matches HTML
    By dobField = By.id("dob");           // matches HTML
    By addressField = By.id("address");   // matches HTML
    By mobileField = By.id("mobile");     // changed from contactno → mobile
    By submitButton = By.cssSelector("button[type='submit']");
    // No message element in HTML — you may need to add or remove this
    By messageText = By.id("message");

    // Actions
    public void enterEmpId(String empId) {
        driver.findElement(empIdField).clear();
        driver.findElement(empIdField).sendKeys(empId);
    }

    public void enterEmpName(String empName) {
        driver.findElement(empNameField).clear();
        driver.findElement(empNameField).sendKeys(empName);
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).clear();
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterDOB(String dob) {
        driver.findElement(dobField).clear();
        driver.findElement(dobField).sendKeys(dob);
    }

    public void enterAddress(String address) {
        driver.findElement(addressField).clear();
        driver.findElement(addressField).sendKeys(address);
    }

    public void enterMobile(String mobile) {
        driver.findElement(mobileField).clear();
        driver.findElement(mobileField).sendKeys(mobile);
    }

    public void clickSubmit() {
        driver.findElement(submitButton).click();
    }

    public String getConfirmationMessage() {
        if (driver.findElements(messageText).isEmpty()) {
            return null;
        }
        WebElement message = driver.findElement(messageText);
        return message.isDisplayed() ? message.getText() : null;
    }
}
