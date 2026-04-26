package strategy.payment.context;

import strategy.payment.strategy.PaymentStrategy;

public class PaymentContext {

    private PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void processPayment(double amount) {
        if (strategy == null) {
            System.out.println("No payment strategy selected");
            return;
        }
        strategy.pay(amount);
    }
}