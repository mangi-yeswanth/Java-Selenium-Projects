package selenium_pkg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SearchGame {
    public static void main(String[] args) {
////Set the path to your browser driver executable
//      //  System.setProperty("webdriver.chrome.driver", "C:\Program Files\Google\Chrome\Application\chrome.exe"); 
//        WebDriver driver = new ChromeDriver(); // Initialize the browser
//        driver.get("https://www.google.com"); // Navigate to a website
//        System.out.println("Title: " + driver.getTitle()); // Print the page title
//        driver.quit(); // Close the browser
    	WebDriver driver=null; 

		try {

		// Launch Chrome browser

		driver = new ChromeDriver();
 
		// Go to Google

		driver.get("https://www.youtube.com/");
 
		// Find the search box and type a query

		WebElement searchBox = driver.findElement(By.name("search_query"));

		searchBox.sendKeys("god of war");
 
		// Submit the search form

		searchBox.submit();
 
		// Wait a bit (basic pause, not best practice)

			Thread.sleep(10000); // Wait 4 seconds for results to load

		} catch (InterruptedException e) {

			// e.printStackTrace();

		}
 
		// Print the title of the results page

		System.out.println("Search Results Page Title: " + driver.getTitle());
 
		// Close the browser

		driver.quit();

 
    }
}
