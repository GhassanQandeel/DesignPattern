package strategy.payment;

import strategy.payment.strategy.PaymentStrategy;

public class PayPalPayment implements PaymentStrategy {

    @Override
    public void pay(double amount){
        System.out.println("Payment of $" + amount + " payPal");
    }
}
