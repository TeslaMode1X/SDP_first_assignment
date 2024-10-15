package Strategy;

public class CashOnDeliveryStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Your final sum is: " + (amount + 300) + "$");
    }
}
