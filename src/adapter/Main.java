package adapter;

import adapter.adapter.PayPalAdapter;
import adapter.source.PayPalAPI;
import adapter.target.PaymentProcessor;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PayPalAdapter(new PayPalAPI());
        paymentProcessor.pay(1000);
    }
}
