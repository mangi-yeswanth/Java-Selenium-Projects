package com.example.seleniumcrossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CrossBrowserTest {
    public static WebDriver driver;

    public static void main(String[] args) {
        // List of browsers to test
        String[] browsers = {"chrome", "firefox", "edge"};

        for (String browser : browsers) {
            // Launch the desired browser
            switch (browser.toLowerCase()) {
                case "chrome":
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    driver = new FirefoxDriver();
                    break;
                case "edge":
                    driver = new EdgeDriver();
                    break;
                default:
                    System.out.println("Unsupported browser: " + browser);
                    continue;
            }
            driver.get("https://youtube.com");
            System.out.println("Browser: " + browser + " | Title: " + driver.getTitle());

            // Close the browser after the test
            driver.quit();
        }
    }
}
