package Abstract;

// Decaffeinate ingredients
public class DecaffeinateIngredientsFactory implements CoffeeAddingFactory {
    @Override
    public Milk createMilk() {
        return new CoconutMilk();
    }

    @Override
    public Additives createAdditives() {
        return new CinnamonStick();
    }

    @Override
    public Syrup addSyrup() {
        return new StarbucksSpecialSyrup();
    }
}
