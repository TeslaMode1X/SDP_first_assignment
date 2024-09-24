package Abstract;

// Cappuccino ingredients
public class CappuccinoIngredientsFactory implements CoffeeAddingFactory {
    @Override
    public Milk createMilk() {
        return new WholeMilk();
    }

    @Override
    public Additives createAdditives() {
        return new Ginger();
    }

    @Override
    public Syrup addSyrup() {
        return new VanillaSyrup();
    }
}
