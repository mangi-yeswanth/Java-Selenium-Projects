package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.EmployeeFormPage;

public class EmployeeFormTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("http://127.0.0.1:5500/employeefirm/index.html");
            driver.manage().window().maximize();

            EmployeeFormPage formPage = new EmployeeFormPage(driver);

            // Fill the form
            formPage.enterEmpId("101");
            formPage.enterEmpName("Harry");
            formPage.enterEmail("harry@example.com");
            formPage.enterDOB("2001-05-11"); // HTML date expects yyyy-MM-dd
            formPage.enterAddress("123 ABC Street");
            formPage.enterMobile("7777777777");

            // Submit
            formPage.clickSubmit();
            Alert alert = driver.switchTo().alert();
            System.out.println("Alert text: " + alert.getText());
            alert.accept(); // Click OK to close the alert

            Thread.sleep(1000);
            String message = formPage.getConfirmationMessage();
            if (message != null) {
                System.out.println("Success: " + message);
            } else {
                System.out.println("Form submitted — no message element found.");
            }

            Thread.sleep(4000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
