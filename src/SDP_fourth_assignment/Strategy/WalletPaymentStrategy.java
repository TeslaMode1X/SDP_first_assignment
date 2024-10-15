package Strategy;

public class WalletPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Your final sum is: " + amount + "$");
    }
}
