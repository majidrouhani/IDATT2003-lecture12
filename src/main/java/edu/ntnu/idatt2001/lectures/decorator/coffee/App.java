package edu.ntnu.idatt2001.lectures.decorator.coffee;

public class App {
    public static void main(String[] args) {
        // create a simple coffee
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " costs $" + coffee.getCost());

        // add milk to the coffee
        coffee = new MilkCoffee(coffee);
        System.out.println(coffee.getDescription() + " costs $" + coffee.getCost());
    }
}