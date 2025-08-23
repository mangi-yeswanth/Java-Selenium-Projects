package com.example.seleniumtestngDependancy;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class GoogleDependencyTest {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void launchGoogle() {
        driver.get("https://www.google.com");
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Google homepage did not open!");
    }

    @Test(dependsOnMethods = {"launchGoogle"})
    public void searchSelenium() {
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium WebDriver");
        searchBox.sendKeys(Keys.RETURN);
        Assert.assertTrue(driver.getTitle().contains("Selenium WebDriver"), "Search failed!");
        try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    

    @Test(dependsOnMethods = {"searchSelenium"})
    public void verifyResults() {
        WebElement results = driver.findElement(By.id("search"));
        Assert.assertTrue(results.isDisplayed(), "Search results are not displayed!");
        System.out.println("Search results verified successfully ");
        try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
