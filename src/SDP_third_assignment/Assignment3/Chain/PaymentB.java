package Assignment3.Chain;

public class PaymentB extends PaymentHandler {
    @Override
    public boolean handle(int dollar) {
        if (dollar <= 300) {
            System.out.println("Оплата прошла успешно");
            return true;
        } else if (next != null) {
            return next.handle(dollar);
        }
        System.out.println("Недостаточно баланса в PaymentB");
        return false;
    }
}
