package com.example.seleniumGrid.SeleniumGrid;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
 
import java.net.MalformedURLException;
import java.net.URL;
public class SeleniumGridTest {
   public static void main(String[] args) {
       try {
           // URL of the Selenium Grid hub
           URL gridURL = new URL("http://localhost:4444");
 
           // Set Chrome options or other browser options
           ChromeOptions options = new ChromeOptions();
 
           // Initialize RemoteWebDriver with Grid URL and browser options
           WebDriver driver = new RemoteWebDriver(gridURL, options);
 
           // Navigate to a site
           driver.get("https://www.google.com");
           System.out.println("Page Title is: " + driver.getTitle());
 
           // Close the browser
          driver.quit();
 
       } catch (MalformedURLException e) {
          e.printStackTrace();
       }
   }
}