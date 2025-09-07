package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckoutPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;

public class CheckoutPageTest extends BaseTest {

    @Test
    public void verifyCheckoutPageAndPlaceOrder() {
        driver.get("https://automationexercise.com");

        HomePage homePage = new HomePage(driver);
        homePage.clickSignUpLogin();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("yeswanthmangi@gmail.com", "Yesh@66543211");
        Assert.assertTrue(loginPage.isLoggedIn(), " Login failed, checkout test cannot proceed!");

        ProductPage productPage = new ProductPage(driver);
        productPage.addFirstProductToCart();
        productPage.continueShopping();
        productPage.addFirstProductToCart();
        productPage.viewCart();

        CartPage cartPage = new CartPage(driver);
        Assert.assertTrue(cartPage.isCartDisplayed(), " Cart page is not displayed!");

        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.proceedToCheckout();
        checkoutPage.clickPlaceOrder();

        Assert.assertTrue(checkoutPage.isOnPaymentPage(),
                " Failed to navigate to Payment page after clicking Place Order!");

        getTest().pass(" Checkout page verified and navigation to Payment page successful.");
    }
}
