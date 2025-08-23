package com.example.seleniumtestNGListeners;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

@Listeners(CustomListener.class)   // Attach the listener
public class GoogleTest {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void launchGoogle() throws InterruptedException {
        driver.get("https://www.google.com");
    // wait 10 seconds after page load
        Assert.assertEquals(driver.getTitle(), "Google");
    }

    @Test(dependsOnMethods = {"launchGoogle"})
    public void searchYoutube() throws InterruptedException {
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("https://www.youtube.com/");
        searchBox.sendKeys(Keys.RETURN);
        Thread.sleep(13000);  
    }

    @Test
    public void failingTest() throws InterruptedException {
        Thread.sleep(1000);   
        Assert.fail("Intentional Failure ");
    }
    @Test(dependsOnMethods= {"failingTest"})
    public void dependTest() throws InterruptedException {
        Thread.sleep(1000);   
        System.out.println("skipped test");
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(10000);   // wait 10 seconds before quitting
        driver.quit();
    }
}
