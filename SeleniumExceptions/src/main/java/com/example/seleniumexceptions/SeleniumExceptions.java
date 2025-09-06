package com.example.seleniumexceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;

public class SeleniumExceptions {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().window().maximize();
            driver.get("https://demo.nopcommerce.com/");

            JavascriptExecutor js = (JavascriptExecutor) driver;
            Object result = js.executeScript("return navigator.webdriver;");
            System.out.println("navigator.webdriver: " + result);

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Click "Log in" link
            WebElement loginLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Log in")));
            loginLink.click();

            // Enter email
            WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Email")));
            emailField.clear();
            emailField.sendKeys("yeswanthmangi@gmail.com");

            // Enter password
            WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Password")));
            passwordField.sendKeys("Yesh@66543211");

            // Click "Log in" button
            WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//button[normalize-space()='Log in']")));
            loginButton.click();

            System.out.println(" Login flow executed successfully!");

        } catch (NoSuchElementException e) {
            System.out.println(" Element not found: " + e.getMessage());
        } catch (ElementNotInteractableException e) {
            System.out.println(" Element not interactable: " + e.getMessage());
        } catch (TimeoutException e) {
            System.out.println(" Timeout waiting for element: " + e.getMessage());
        } catch (WebDriverException e) {
            System.out.println(" WebDriver error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(" Unexpected error: " + e.getMessage());
        } finally {
            driver.quit();
            System.out.println(" Browser closed");
        }
    }
}
