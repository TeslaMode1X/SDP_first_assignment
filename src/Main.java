import Abstract.CappuccinoIngredientsFactory;
import Abstract.CoffeeAddingFactory;
import Abstract.CustomIngredientsFactory;
import Abstract.DecaffeinateIngredientsFactory;
import Builder.CoffeeBuilder;
import Factory.CappuccinoFactory;
import Factory.Coffee;
import Factory.CoffeeFactory;
import Factory.DecaffeinateFactory;
import Singleton.Cafe;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
//        #1 Task. Singleton
        Cafe firstCafe = Cafe.getInstance();
        Cafe secondCafe = Cafe.getInstance();
        if (firstCafe == secondCafe) {
            System.out.println("true");
        }

//        #3 Task. Abstract
        CoffeeAddingFactory cappuccinoIngredients = new CappuccinoIngredientsFactory();

//        #2 Task. Factory
        CoffeeFactory cappuccinoFactory = new CappuccinoFactory(cappuccinoIngredients);
        Coffee cappuccino = cappuccinoFactory.createCoffee();
        firstCafe.addOrder(cappuccino);

        CoffeeAddingFactory decaffeinateIngredients = new DecaffeinateIngredientsFactory();
        CoffeeFactory decaffeinateFactory = new DecaffeinateFactory(decaffeinateIngredients);
        Coffee decaffeinate = decaffeinateFactory.createCoffee();
        secondCafe.addOrder(decaffeinate);

//        #5 Task. Builder
        Coffee cappuccinoCustom = new CoffeeBuilder()
                .setName("Decaffeinate")
                .setPrice(29.99)
                .setVolume(450)
                .setMilk(true)
                .setCaffeineContent(29.9)
                .setBrewTime(10)
                .setIngredients(new CustomIngredientsFactory())
                .build();

        firstCafe.addOrder(cappuccinoCustom);

//         #4 Prototype
        Coffee cappuccinoPrototype = cappuccino.clone();
        if (cappuccinoPrototype != cappuccino) {
            System.out.println("Prototype of cappuccino successfully created!");
        }
        Coffee decaffeinatePrototype = decaffeinate.clone();
        if (decaffeinatePrototype != decaffeinate) {
            System.out.println("Prototype of decaffeinate successfully created!");
        }
        firstCafe.addOrder(cappuccinoPrototype);
        firstCafe.addOrder(decaffeinatePrototype);

        firstCafe.showOrders();
//        secondCafe.showOrders();
    }
}