package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;

public class CartPageTest extends BaseTest {

    @Test
    public void verifyCartAndProceedToCheckout() {
        driver.get("https://automationexercise.com");

        HomePage homePage = new HomePage(driver);
        homePage.clickSignUpLogin();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("yeswanthmangi@gmail.com", "Yesh@66543211");
        Assert.assertTrue(loginPage.isLoggedIn(), "Login failed, cannot proceed to cart test.");

        CartPage cartPage = new CartPage(driver);
        cartPage.cartClick();

        Assert.assertTrue(cartPage.isCartDisplayed(), "Cart is not displayed!");
        getTest().pass("Cart page is displayed successfully.");
    }
}
