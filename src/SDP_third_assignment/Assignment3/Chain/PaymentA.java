package Assignment3.Chain;

public class PaymentA extends PaymentHandler {
    @Override
    public boolean handle(int dollar) {
        if (dollar <= 100) {
            System.out.println("Оплата прошла успешно");
            return true;
        } else if (next != null) {
            return next.handle(dollar);
        }
        System.out.println("Недостаточно баланса в PaymentA");
        return false;
    }
}
