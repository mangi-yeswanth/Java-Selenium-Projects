package com.example.radiocheckboxselenium.RadioCheckboxSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTestCapstone {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://o3.openmrs.org/openmrs/spa/login");
            driver.manage().window().maximize();

            Thread.sleep(3000);

            WebElement username = driver.findElement(By.xpath("//input[@type='text' and @placeholder='Username']"));
            username.sendKeys("admin");

            // Click the Continue button
            WebElement continueBtn = driver.findElement(By.xpath("//button[normalize-space()='Continue']"));
            continueBtn.click();

            // Step 2: Enter password in the input with placeholder 'Password'
            WebElement password = driver.findElement(By.xpath("//input[@type='password' and @placeholder='Password']"));
            password.sendKeys("Admin123");

            // Click the Log in button
            WebElement loginBtn = driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
            loginBtn.click();

            // Verify login successful (redirect to home page)
            if (driver.getCurrentUrl().contains("home")) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Login failed!");
            }

        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
