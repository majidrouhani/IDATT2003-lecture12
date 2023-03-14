package edu.ntnu.idatt2001.lectures.decorator.coffee;

// Concrete decorator
class MilkCoffee extends CoffeeDecorator {
    public MilkCoffee(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with milk";
    }
}