package tests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import pages.PracticeFormPage;
import utils.DriverFactory;
public class PracticeFormTest {
    WebDriver driver;
    PracticeFormPage formPage;

    @BeforeMethod
    public void setUp() {
        driver = DriverFactory.getDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        formPage = new PracticeFormPage(driver);
    }

    @Test
    public void testFillFormAndUploadFile() {
        formPage.enterBasicInfo("John", "soggadipeta street tekkali", "1234567890", "India", "john.doe@test.com");
        formPage.selectGender("male");
        formPage.selectDays();
        formPage.selectFromDropdown("Morning");

        String filePath = System.getProperty("user.dir") + "/src/test/resources/sample1.png";
        formPage.uploadSingleFile(filePath);

        System.out.println("Form filled and single file uploaded successfully.");
    }

    @Test
    public void testMultipleFileUpload() {
        String file1 = System.getProperty("user.dir") + "/src/test/resources/sample1.png";
        String file2 = System.getProperty("user.dir") + "/src/test/resources/sample2.png";

        formPage.uploadMultipleFiles(file1, file2);

        System.out.println("Multiple files uploaded successfully.");
    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}