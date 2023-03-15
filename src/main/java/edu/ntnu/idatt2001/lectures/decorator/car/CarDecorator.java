package edu.ntnu.idatt2001.lectures.decorator.car;

public abstract class CarDecorator implements Car {
    protected Car car;

    protected CarDecorator(Car c){
        this.car=c;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }
}