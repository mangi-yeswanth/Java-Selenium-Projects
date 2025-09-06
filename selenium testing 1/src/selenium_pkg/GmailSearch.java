package selenium_pkg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GmailSearch {
	    public static void main(String[] args) {
	////Set the path to your browser driver executable
//	      //  System.setProperty("webdriver.chrome.driver", "C:\Program Files\Google\Chrome\Application\chrome.exe"); 
//	        WebDriver driver = new ChromeDriver(); // Initialize the browser
//	        driver.get("https://www.google.com"); // Navigate to a website
//	        System.out.println("Title: " + driver.getTitle()); // Print the page title
//	        driver.quit(); // Close the browser
	    	WebDriver driver=null; 

			try {

			// Launch Chrome browser

			driver = new ChromeDriver();
	 
			// Go to Google

			driver.get("https://mail.google.com/mail/");
	 
			// Find the search box and type a query

			WebElement searchBox = driver.findElement(By.id("identifierId"));

			searchBox.sendKeys("yeswanthmangi@gmail.com");
			
	 
			// Submit the search form

			searchBox.submit();
			WebElement searchBox2= driver.findElement(By.id("Passwd"));
			searchBox2.submit();
	 
			// Wait a bit (basic pause, not best practice)

				Thread.sleep(25000); // Wait 4 seconds for results to load

			} catch (InterruptedException e) {

				// e.printStackTrace();

			}
	 
			// Print the title of the results page

			System.out.println("Search Results Page Title: " + driver.getTitle());
	 
			// Close the browser

			driver.quit();

	 
	    }
	}
