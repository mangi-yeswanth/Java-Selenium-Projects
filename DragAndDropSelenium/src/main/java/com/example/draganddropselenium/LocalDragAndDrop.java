package com.example.draganddropselenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;

public class LocalDragAndDrop {
   public static void main(String[] args) throws InterruptedException {
      
      WebDriver driver = new ChromeDriver();

      // Load local HTML file
      File file = new File("D:\\dragdrop.html");
      String url = "file:///" + file.getAbsolutePath();
      driver.get(url);

      // Identify drag & drop elements
      WebElement dragElement = driver.findElement(By.id("drag"));
      WebElement dropElement = driver.findElement(By.id("drop"));

      // Perform Drag and Drop
      Actions actions = new Actions(driver);
      actions.dragAndDrop(dragElement, dropElement).perform();

      // Wait to see the result
      Thread.sleep(4000);

      driver.quit();
   }
}
