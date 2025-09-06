package com.example.seleniumfrommysql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class MySQLWithSelenium {
 
   public static void main(String[] args) {
       Connection conn = null;
       Statement stmt  = null;
       ResultSet rs    = null;
       WebDriver driver = null;
 
       try {
           // 1) JDBC connection
           String url      = "jdbc:mysql://localhost:3306/customer";
           String user     = "root";
           String password = "Yesh@66543211";
 
           conn = DriverManager.getConnection(url, user, password);
           stmt = conn.createStatement();
           rs   = stmt.executeQuery("SELECT username, password FROM users WHERE userid = 1");
 
           String dbUsername = null;
           String dbPassword = null;
 
           if (rs.next()) {
              dbUsername = rs.getString("username");
              dbPassword = rs.getString("password");
           }
 
           // 2) Selenium usage of the DB values
          
driver = new ChromeDriver();
              driver.get("http://127.0.0.1:5500/htmltable/contains.html");
 
           // Fill HTML login form using the data fetched from MySQL
           WebElement usernameInput = driver.findElement(By.xpath("//input[@name='username']"));
           WebElement passwordInput = driver.findElement(By.xpath("//input[@name='password']"));
           WebElement loginBtn = driver.findElement(By.id("loginBtn"));

 
          usernameInput.sendKeys(dbUsername);
          passwordInput.sendKeys(dbPassword);
          loginBtn.click();
          Thread.sleep(4000); 
       } catch (Exception e) {
          e.printStackTrace();
       } finally {
           // JDBC cleanup
           try { if (rs != null)  rs.close(); }   catch (Exception ignored) {}
           try { if (stmt != null) stmt.close(); } catch (Exception ignored) {}
           try { if (conn != null) conn.close(); } catch (Exception ignored) {}
 
           // Close browser
           if (driver != null) {
              driver.quit();
           }
       }
   }
}