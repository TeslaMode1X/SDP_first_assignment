package Abstract;

// coffee adding interface
public interface CoffeeAddingFactory {
    Milk createMilk();
    Additives createAdditives();
    Syrup addSyrup();
}
