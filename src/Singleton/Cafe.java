package Singleton;

import Factory.Coffee;
import java.util.ArrayList;
import java.util.List;

// Singleton Example Of Cafe
public class Cafe {
    // Only instance of a cafe
    private static Cafe instance;

    // All orders
    private List<String> orders;

    // Private Initializer
    private Cafe() {
        orders = new ArrayList<>();
        System.out.println("Cafe is initialized");
    }

    // Public Initializer
    public static Cafe getInstance() {
        if (instance == null) {
            instance = new Cafe();
        }

        return instance;
    }

    // Adding a new Order
    public void addOrder(Coffee order) {
        orders.add(order.brew());
        System.out.println("Order added: " + order.getName());
    }

    // Show something
    public void showOrders() {
        for (int i = 0; i < orders.size(); i++) {
            System.out.printf("#%d, %s%n", i + 1, orders.get(i));
        }
    }
}
