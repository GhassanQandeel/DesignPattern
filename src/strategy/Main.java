package strategy;

import strategy.payment.CashPayment;
import strategy.payment.CreditCardPayment;
import strategy.payment.PayPalPayment;
import strategy.payment.context.PaymentContext;

public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setStrategy(new CreditCardPayment());
        context.processPayment(100);

        context.setStrategy(new PayPalPayment());
        context.processPayment(200);

        context.setStrategy(new CashPayment());
        context.processPayment(50);
    }
}
