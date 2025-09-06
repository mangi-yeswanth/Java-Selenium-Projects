package com.example.Log4j2.Log4j2Implementation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLog4jExample {
    private static final Logger logger = LogManager.getLogger(SeleniumLog4jExample.class);

    public static void main(String[] args) {
        logger.info("Starting Selenium test with Log4j2");

        WebDriver driver = new ChromeDriver();
        logger.info("Chrome browser launched");

        try {
            driver.get("https://o3.openmrs.org/openmrs/spa/login");
            logger.info("Navigated to OpenMRS login page");

            // Enter username
            WebElement username = driver.findElement(By.cssSelector("input[type='text']"));
            username.sendKeys("admin");
            logger.info("Entered username: admin");

            // Click Continue
            driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
            logger.info("Clicked Continue button");

            // Enter password
            WebElement password = driver.findElement(By.cssSelector("input[type='password']"));
            password.sendKeys("Admin123");
            logger.info("Entered password");

            // Click Login
            driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
            logger.info("Clicked Log in button");

        } catch (Exception e) {
            logger.error("Error during Selenium test", e);
        } finally {
            driver.quit();
            logger.info("Browser closed");
        }
    }
}
