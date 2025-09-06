package com.example.multiplewindowsselenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class MultipleWindowsExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        try {
            // Open the main HTML file
            driver.get("file:///D:/multi_tab_form.html");

            // Store the main window handle
            String mainWindow = driver.getWindowHandle();

            // Click all six links to open new tabs
            driver.findElement(By.id("link1")).click();
            Thread.sleep(3000);
            driver.findElement(By.id("link2")).click();
            Thread.sleep(3000);
            driver.findElement(By.id("link3")).click();
            Thread.sleep(3000);
            driver.findElement(By.id("link4")).click();
            Thread.sleep(3000);
            driver.findElement(By.id("link5")).click();
            Thread.sleep(3000);
            driver.findElement(By.id("link6")).click();
            Thread.sleep(3000);
            driver.findElement(By.id("link7")).click();
            // Wait for tabs to open
            Thread.sleep(3000);

            // Get all window handles
            Set<String> allWindows = driver.getWindowHandles();

            // Loop through all windows
            for (String windowHandle : allWindows) {
                if (!windowHandle.equals(mainWindow)) {
                    driver.switchTo().window(windowHandle);

                    System.out.println("Switched to window: " + driver.getTitle());

                    // Simulate some work in the child window
                    Thread.sleep(3000);

                    // Close the child window
                    driver.close();
                    System.out.println("Closed child window.");
                }
            }

            // Switch back to the main window
            driver.switchTo().window(mainWindow);
            System.out.println("Back to main window: " + driver.getTitle());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Always quit the driver at the end
            driver.quit();
        }
    }
}
