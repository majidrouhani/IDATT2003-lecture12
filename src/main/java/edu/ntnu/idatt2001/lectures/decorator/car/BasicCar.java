package edu.ntnu.idatt2001.lectures.decorator.car;

public class BasicCar implements Car {
    @Override
    public void assemble() {
        System.out.println("Basic Car.");
    }
}