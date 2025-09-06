package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PracticeFormPage extends BasePage {

    // --- Text fields ---
    @FindBy(id="name")
    WebElement firstName;

    @FindBy(id="email")
    WebElement email;

    @FindBy(id="phone")
    WebElement phone;

    @FindBy(id="country")
    WebElement Country;

    @FindBy(id="country")
    WebElement city;

    @FindBy(id="textarea")
    WebElement address;

    // --- Radio buttons ---
    @FindBy(xpath="//label[text()='Male']")
    WebElement genderMale;

    @FindBy(xpath="//label[text()='Female']")
    WebElement genderFemale;

    // --- Checkboxes ---
    @FindBy(xpath="//label[text()='Sunday']")
    WebElement daySunday;

    @FindBy(xpath="//label[text()='Monday']")
    WebElement dayMonday;

    // --- Dropdown ---
    @FindBy(id="RESULT_RadioButton-9")
    WebElement dropdown;

    // --- File upload ---
    @FindBy(id="RESULT_FileUpload-10")
    WebElement fileUploadInput;

    public PracticeFormPage(WebDriver driver) {
        super(driver);
    }

	// Actions
    public void enterBasicInfo(String fname, String lname, String phoneNo, String countryName, String emailId) {
        type(firstName, fname);
        type(address, lname);
        type(phone, phoneNo);
        type(Country, countryName);
        type(email, emailId);
    }

    public void selectGender(String gender) {
        if (gender.equalsIgnoreCase("male")) {
            click(genderMale);
        } else {
            click(genderFemale);
        }
    }

    public void selectDays() {
        click(daySunday);
        click(dayMonday);
    }

    public void selectFromDropdown(String value) {
        selectByVisibleText(dropdown, value);
    }

    public void uploadSingleFile(String filePath) {
        fileUploadInput.sendKeys(filePath);
    }

    public void uploadMultipleFiles(String... filePaths) {
        StringBuilder paths = new StringBuilder();
        for (String path : filePaths) {
            paths.append(path).append("\n");
        }
        fileUploadInput.sendKeys(paths.toString().trim());
    }
}