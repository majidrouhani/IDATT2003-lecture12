package edu.ntnu.idatt2001.lectures.decorator.car;

public class LuxuryCar extends CarDecorator {
    public LuxuryCar(Car c) {
        super(c);
    }

    @Override
    public void assemble(){
        super.assemble();
        System.out.println("Adding features of Luxury Car.");
    }
}