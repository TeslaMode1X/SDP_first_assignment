package Factory;

import Abstract.CoffeeAddingFactory;


// Factory for Decaffeinate
public class DecaffeinateFactory extends CoffeeFactory {
    private CoffeeAddingFactory ingredientFactory;
    public DecaffeinateFactory(CoffeeAddingFactory decaffeinateIngredients) {
        this.ingredientFactory = decaffeinateIngredients;
    }
    @Override
    public Coffee createCoffee() {
        return new Decaffeinate(ingredientFactory);
    }
}
