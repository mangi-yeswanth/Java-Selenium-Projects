package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
    private WebDriver driver;

    // Basic Details
    private By name = By.id("name");
    private By email = By.id("email");
    private By phone = By.id("phone");
    private By addressTextarea = By.id("textarea");

    // Gender radio buttons
    private By maleRadio = By.id("male");
    private By femaleRadio = By.id("female");

    // Checkbox
    private By tuesdayCheckbox = By.id("tuesday");
    //dropdown
    private By countryDropdown = By.id("country");
    private By colorsDropdown = By.id("colors");
    private By animalsDropdown = By.id("animals");

    // File upload (input[type='file'])
    private By upload= By.cssSelector("input[type='file']"); // Update with actual ID if present

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Interactions
    public void setName(String value) {
        driver.findElement(name).sendKeys(value);
    }
    public void setEmail(String value) {
        driver.findElement(email).sendKeys(value);
    }
    public void setPhone(String value) {
        driver.findElement(phone).sendKeys(value);
    }
    public void setAddressTextarea(String value) {
        driver.findElement(addressTextarea).sendKeys(value);
    }
    public void setFemale() {
        driver.findElement(femaleRadio).click();
    }
    public void selectCountry(String countryName) {
        WebElement dropdownElement = driver.findElement(countryDropdown);
        Select select = new Select(dropdownElement);
        select.selectByVisibleText(countryName);
    }

    // Setter for dropdown (Colors)
    public void selectColors(String color) {
        WebElement dropdownElement = driver.findElement(colorsDropdown);
        Select select = new Select(dropdownElement);
        select.selectByVisibleText(color);
    }
    public void selectAnimals(String animal) {
        WebElement dropdownElement = driver.findElement(animalsDropdown);
        Select select = new Select(dropdownElement);
        select.selectByVisibleText(animal);
    }
    
    public void selectMale() {
        driver.findElement(maleRadio).click();
    }
    public void selectTuesday() {
        driver.findElement(tuesdayCheckbox).click();
    }
    public void uploadFile(String filePath) {
        driver.findElement(upload).sendKeys(filePath);
    }
}