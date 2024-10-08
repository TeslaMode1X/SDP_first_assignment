package Assignment3.Chain;

public class Main {
    public static void main(String[] args) {
        PaymentHandler a = new PaymentA();
        PaymentHandler b = new PaymentB();
        PaymentHandler c = new PaymentC();

        a.setNext(b).setNext(c);
        boolean res = a.handle(100);

        // результаты оплаты
        if (res) {
            System.out.println("да");
        } else {
            System.out.println("не");
        }
    }

}
