package com.example.radiocheckboxselenium.RadioCheckboxSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormHandlingExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        try {
            // Load local form.html file
            driver.get("file:///D:/form.html");

            // Select radio button (Male)
            WebElement maleRadio = driver.findElement(By.id("male"));
            if (!maleRadio.isSelected()) {
                maleRadio.click();
            }

            // Select checkbox
            WebElement agreeCheckbox = driver.findElement(By.id("agree"));
            if (!agreeCheckbox.isSelected()) {
                agreeCheckbox.click();
            }

            // Select dropdown value (India)
            WebElement countryDropdownElement = driver.findElement(By.id("country"));
            Select countryDropdown = new Select(countryDropdownElement);
            countryDropdown.selectByVisibleText("Japan");

            // Print selected value
            WebElement selected = countryDropdown.getFirstSelectedOption();
            System.out.println("Selected Country: " + selected.getText());
            Thread.sleep(6000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
