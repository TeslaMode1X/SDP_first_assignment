package Builder;

import Abstract.CoffeeAddingFactory;
import Factory.Cappuccino;
import Factory.Coffee;
import Factory.Decaffeinate;

// Builder for creating customizable coffees for existing ones
public class CoffeeBuilder {
    private String name;
    // dollars
    private double price;
    // ml
    private int volume;
    private boolean hasMilk;
    // mg
    private double caffeineContent;
    // min
    private int brewTime;
    private CoffeeAddingFactory addings;

    // getters and setters
    public CoffeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public CoffeeBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public CoffeeBuilder setVolume(int volume) {
        this.volume = volume;
        return this;
    }

    public CoffeeBuilder setMilk(boolean milk) {
        this.hasMilk = milk;
        return this;
    }

    public CoffeeBuilder setCaffeineContent(double caffeineContent) {
        this.caffeineContent = caffeineContent;
        return this;
    }

    public CoffeeBuilder setBrewTime(int brewTime) {
        this.brewTime = brewTime;
        return this;
    }

    public CoffeeBuilder setIngredients(CoffeeAddingFactory addings) {
        this.addings = addings;
        return this;
    }

    // Return a coffee type
    public Coffee build() {
        if (name.equals("Cappuccino")) {
            return new Cappuccino(name, price, volume, hasMilk, caffeineContent, brewTime, addings);
        } else if (name.equals("Decaffeinate")) {
            return new Decaffeinate(name, price, volume, hasMilk, caffeineContent, brewTime, addings);
        }
        return null;
    }
}
