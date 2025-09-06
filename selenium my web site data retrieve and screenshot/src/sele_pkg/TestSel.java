package sele_pkg;

	import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	 
	import java.util.List;
	 
	public class TestSel{
	    public static void main(String[] args) {
	    	WebDriver driver = new ChromeDriver();
	    	try {
	    	
			driver.get("https://o3.openmrs.org/openmrs/spa/login");
			driver.manage().window().maximize();
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
	        Object result = js.executeScript("return navigator.webdriver;");
	 
	        System.out.println("navigator.webdriver: " + result);
			
			driver.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
			driver.findElement(By.id("password")).sendKeys("Admin123");
			driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
	            // 6. Extract all paragraphs
	            List<WebElement> allParagraphs = driver.findElements(By.tagName("p"));
	            System.out.println("Paragraphs:");
	            for (WebElement para : allParagraphs) {
	                System.out.println(para.getText());
	            }
	            Thread.sleep(10000);
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            // 7. Close browser
	            driver.quit();
	        }
	    }
	}
