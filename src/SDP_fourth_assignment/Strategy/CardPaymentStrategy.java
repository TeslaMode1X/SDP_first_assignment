package Strategy;

public class CardPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Your final sum is: " + (amount + amount * 0.02) + "$");
    }
}
