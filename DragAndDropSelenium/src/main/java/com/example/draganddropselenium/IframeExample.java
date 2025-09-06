package com.example.draganddropselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;

public class IframeExample {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        File file = new File("D:\\main.html");
        String url = "file:///" + file.getAbsolutePath();
        driver.get(url);

        driver.switchTo().frame("myFrame1");
        WebElement input1 = driver.findElement(By.id("message1"));
        input1.sendKeys("Hello from Frame 1!");
        Thread.sleep(2000);

        driver.switchTo().defaultContent();

        driver.switchTo().frame("myFrame2");
        WebElement input2 = driver.findElement(By.id("message2"));
        input2.sendKeys("Hello from Frame 2!");
        Thread.sleep(2000);

        driver.switchTo().defaultContent();
        WebElement input3 = driver.findElement(By.id("message3"));
        input3.sendKeys("Hello from Frame 3!");
        Thread.sleep(2000);
        driver.quit();
    }
}
