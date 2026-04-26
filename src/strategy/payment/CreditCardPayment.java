package strategy.payment;

import strategy.payment.strategy.PaymentStrategy;


public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " to CreditCard");
    }

}
