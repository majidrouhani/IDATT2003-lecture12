package edu.ntnu.idatt2001.lectures.decorator.coffee;

// Concrete component
class SimpleCoffee implements Coffee {
    public double getCost() {
        return 1.0;
    }
    public String getDescription() {
        return "Simple coffee";
    }
}
