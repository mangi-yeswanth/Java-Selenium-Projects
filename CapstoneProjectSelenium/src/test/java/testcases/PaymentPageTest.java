package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PaymentPage;

public class PaymentPageTest extends BaseTest {

    @Test
    public void verifyPaymentAndConfirmOrder() {
        driver.get("https://automationexercise.com/payment");

        PaymentPage paymentPage = new PaymentPage(driver);
        paymentPage.enterPaymentDetails("Yeswanth", "9441619865412358", "303", "01", "2030");
        paymentPage.confirmOrder();

        Assert.assertTrue(
                driver.getPageSource().contains("Order Placed!"),
                "Order confirmation message not found!"
        );
    }
}
