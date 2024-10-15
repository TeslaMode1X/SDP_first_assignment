package Strategy;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        order.setStrategy(new CardPaymentStrategy());
        order.payment(300);

        order.setStrategy(new CashOnDeliveryStrategy());
        order.payment(300);

        order.setStrategy(new WalletPaymentStrategy());
        order.payment(300);
    }
}
