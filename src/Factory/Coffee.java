package Factory;

// Main behaviour of coffee classes
public interface Coffee {
    String getName();
    double getPrice();
    int getVolume();
    boolean hasMilk();
    double getCaffeineContent();
    String brew();
    Coffee clone();
}
