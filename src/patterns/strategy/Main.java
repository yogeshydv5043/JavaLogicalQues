package patterns.strategy;

public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment());
        context.makePayment(1500.0);

        context.setPaymentStrategy(new UpiPayment());
        context.makePayment(500.0);

        context.setPaymentStrategy(new PayPalPayment());
        context.makePayment(2500.0);
    }
}
