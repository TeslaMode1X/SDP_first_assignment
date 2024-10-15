package Strategy;

// held some payment stratagem
public class Order{
    private PaymentStrategy strategy;
    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }
    public void payment(double money) {
        if (this.strategy != null) {
            this.strategy.pay(money);
        } else {
            System.out.println("No payment stratagem selected!");
        }
    }
}
