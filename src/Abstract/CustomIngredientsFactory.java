package Abstract;

// For customizable coffee
public class CustomIngredientsFactory implements CoffeeAddingFactory {
    @Override
    public Milk createMilk() {
        return new WholeMilk();
    }

    @Override
    public Additives createAdditives() {
        return new CinnamonStick();
    }

    @Override
    public Syrup addSyrup() {
        return new VanillaSyrup();
    }
}
