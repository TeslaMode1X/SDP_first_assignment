package Factory;

import Abstract.CoffeeAddingFactory;

// Factory for cappuccino
public class CappuccinoFactory extends CoffeeFactory {
    private CoffeeAddingFactory ingredientFactory;

    public CappuccinoFactory(CoffeeAddingFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    @Override
    public Coffee createCoffee() {
        return new Cappuccino(ingredientFactory);
    }
}
