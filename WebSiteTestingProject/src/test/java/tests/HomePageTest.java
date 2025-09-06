package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;
import pages.HomePage;
import utils.DriverFactory;
import org.testng.Assert;

public class HomePageTest {
    WebDriver driver;
    HomePage home;

    @BeforeClass
    public void setUp() {
        driver = DriverFactory.getDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        home = new HomePage(driver);
    }

    @Test(priority=1)
    public void testTextareas() {
        try {
            home.setName("John Doe");
            home.setEmail("john@example.com");
            home.setPhone("1234567890");
            home.setAddressTextarea("soggadipeta street, tekkali , srikakulam , andhrapradesh, 532201.");
            home.selectMale();

            // Assertion example: verify name text field contains expected value
            Assert.assertEquals(driver.findElement(By.id("name")).getAttribute("value"), "John Doe");
        } catch(Exception e) {
            e.printStackTrace();
            Assert.fail("Exception in testTextareas: " + e.getMessage());
        }
    }

    @Test(priority=2)
    public void testRadioButton() {
        try {
            home.selectMale();
            home.selectTuesday();
            Thread.sleep(2000);

            // Assert male radio is selected
            Assert.assertTrue(driver.findElement(By.id("male")).isSelected());
            // Assert Tuesday checkbox is selected
            Assert.assertTrue(driver.findElement(By.id("tuesday")).isSelected());
        } catch(Exception e) {
            e.printStackTrace();
            Assert.fail("Exception in testRadioButton: " + e.getMessage());
        }
    }

    @Test(priority=3)
    public void testDropDown() {
        try {
            home.selectCountry("India");
            Thread.sleep(2000);
            home.selectColors("Red");
            Thread.sleep(2000);
            home.selectAnimals("Cat");

            // Assert country dropdown has "India" selected
            Assert.assertEquals(driver.findElement(By.id("country")).getAttribute("value").toLowerCase(),"india");
            // Assert colors dropdown contains selected option "Red"
            Select colorsSelect = new Select(driver.findElement(By.id("colors")));
            Assert.assertTrue(colorsSelect.getAllSelectedOptions().stream().anyMatch(option -> option.getText().equals("Red")));
            // Assert animals dropdown contains selected option "Cat"
            Select animalsSelect = new Select(driver.findElement(By.id("animals")));
            Assert.assertTrue(animalsSelect.getAllSelectedOptions().stream().anyMatch(option -> option.getText().equals("Cat")));
        } catch(Exception e) {
            e.printStackTrace();
            Assert.fail("Exception in testDropDown: " + e.getMessage());
        }
    }

    @Test
    public void testUploadfile() {
        try {
            home.uploadFile("D:\\test.java");
            Thread.sleep(4000);

        } catch(Exception e) {
            e.printStackTrace();
            Assert.fail("Exception in testUploadfile: " + e.getMessage());
        }
    }
    @AfterClass
    public void close() {
        driver.close();
    }
}