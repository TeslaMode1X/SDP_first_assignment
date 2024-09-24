package Factory;

import Abstract.*;

public class Decaffeinate implements Coffee, Cloneable {
    String name = "Decaffeinate";
    // dollars
    double price = 12.99;
    // ml
    int volume = 200;
    boolean hasMilk = false;
    // grams
    double caffeineContent = 5.0;
    // minutes
    int brewTime = 4;
    CoffeeAddingFactory addings;
    public Decaffeinate(CoffeeAddingFactory ingredientFactory) {
        this.addings = ingredientFactory;
    }

    // For custom Decaffeinate
    public Decaffeinate(String name, double price, int volume, boolean hasMilk, double caffeineContent, int brewTime, CoffeeAddingFactory ingredientFactory) {
        this.name = name;
        this.price = price;
        this.volume = volume;
        this.hasMilk = hasMilk;
        this.caffeineContent = caffeineContent;
        this.brewTime = brewTime;

        this.addings = ingredientFactory;
    }

    // getters and setters
    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public boolean hasMilk() {
        return hasMilk;
    }

    public double getCaffeineContent() {
        return caffeineContent;
    }

    public int getBrewTime() {
        return brewTime;
    }

    @Override
    public String brew() {
        Milk milk = addings.createMilk();
        Syrup syrup = addings.addSyrup();
        Additives additives = addings.createAdditives();

        return "Brewing " + getName() + " with " + milk.getMilk() + ", " + syrup.getSyrup() + ", " + additives.getAdditive() + " for " + getBrewTime() + " minutes";
    }

    @Override
    public Coffee clone() {
        Coffee clone = null;
        try {
            clone = (Coffee) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
