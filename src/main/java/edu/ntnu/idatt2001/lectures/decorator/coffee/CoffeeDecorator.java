package edu.ntnu.idatt2001.lectures.decorator.coffee;

// Decorator
abstract class CoffeeDecorator implements Coffee {
    private Coffee decoratedCoffee;

    protected CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    public double getCost() {
        return decoratedCoffee.getCost();
    }

    public String getDescription() {
        return decoratedCoffee.getDescription();
    }
}
