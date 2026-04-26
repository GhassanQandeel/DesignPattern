package strategy.payment;

import strategy.payment.strategy.PaymentStrategy;

public class CashPayment implements PaymentStrategy {
    @Override
    public void pay(double amount){
        System.out.println("Paying " + amount + " cash");
    }
}
