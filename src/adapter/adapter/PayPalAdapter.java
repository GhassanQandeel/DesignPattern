package adapter.adapter;

import adapter.source.PayPalAPI;
import adapter.target.PaymentProcessor;

public class PayPalAdapter implements PaymentProcessor {

    PayPalAPI paypal;

    public PayPalAdapter(PayPalAPI payPalAPI) {
        this.paypal = payPalAPI;
    }
    @Override
    public void pay(double amount){
        paypal.makePayment(amount);
    }
}
