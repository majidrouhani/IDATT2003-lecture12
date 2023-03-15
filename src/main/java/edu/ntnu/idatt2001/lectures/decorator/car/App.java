package edu.ntnu.idatt2001.lectures.decorator.car;

public class App {
    public static void main(String[] args) {
        Car sportsCar = new SportsCarDecorator(new BasicCar());
        sportsCar.assemble();
        System.out.println("\n*****");

        Car sportsLuxuryCar = new SportsCarDecorator(new LuxuryCarDecorator(new BasicCar()));
        sportsLuxuryCar.assemble();
    }
}