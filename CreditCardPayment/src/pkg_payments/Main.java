package pkg_payments;

public class Main {
public static void main(String[] args) {
        CreditCardPayment creditCard = new CreditCardPayment();
        PayPalPayment paypal = new PayPalPayment();

        creditCard.makePayment(1000.0);
        paypal.makePayment(2000.0);
    }
	
}
