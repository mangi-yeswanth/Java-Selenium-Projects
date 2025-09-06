package sele_pkg;
import org.openqa.selenium.io.FileHandler;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginCheck {
	public static void main(String[] ards) {
	WebDriver driver = new ChromeDriver();
	try {
	
	driver.get("https://demo.nopcommerce.com/");
	driver.manage().window().maximize();
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
    Object result = js.executeScript("return navigator.webdriver;");
    System.out.println("navigator.webdriver: " + result);
    WebElement loginLink = driver.findElement(By.linkText("Log in"));
    loginLink.click();
    Thread.sleep(1000);
	driver.findElement(By.id("Email")).sendKeys("yeswanthmangi@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.id("Password")).sendKeys("Yesh@66543211");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
        // 6. Extract all paragraphs
	Thread.sleep(4000);
	 
    try {
        File theSourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File theDestFile = new File("the_screenshot.png");
        FileHandler.copy(theSourceFile, theDestFile);
        System.out.println("Screenshot done.");

    } catch (IOException e) {
        System.out.println("Screenshot failed: " + e.getMessage());
    } 
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        // 7. Close browser
        driver.quit();
    }
}
}

