package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginPageTest extends BaseTest {

    @Test(priority = 1)
    public void verifyLoginFunctionality() {
        driver.get("https://automationexercise.com");

        HomePage homePage = new HomePage(driver);
        homePage.clickSignUpLogin();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("yeswanthmangi@gmail.com", "Yesh@66543211");

        Assert.assertTrue(loginPage.isLoggedIn(),
                "Login failed: User was not logged in successfully!");

        getTest().pass("verifyLoginFunctionality is passed ");
    }

    @Test(priority = 2)
    public void verifySignupFunctionality() {
        driver.get("https://automationexercise.com");

        HomePage homePage = new HomePage(driver);
        homePage.clickSignUpLogin();

        LoginPage loginPage = new LoginPage(driver);
        String uniqueEmail = "testuser_" + System.currentTimeMillis() + "@mail.com";
        loginPage.signup("TestUser", uniqueEmail);

        Assert.assertTrue(loginPage.isAccountInfoPageDisplayed(),
                "Signup failed: User was not redirected to Enter Account Information page!");

        getTest().pass("verifySignupFunctionality is passed ");
    }

    @Test(priority = 3)
    public void verifyInvalidLoginShowsError() {
        driver.get("https://automationexercise.com");

        HomePage homePage = new HomePage(driver);
        homePage.clickSignUpLogin();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("wronguser@mail.com", "wrongpass");

        String errorMsg = loginPage.getErrorMessage();
        Assert.assertNotNull(errorMsg, "Error message not displayed for invalid login!");
        Assert.assertTrue(errorMsg.contains("incorrect"),
                "Unexpected error message: " + errorMsg);

        getTest().pass("verifyInvalidLoginShowsError is passed ");
    }
}
