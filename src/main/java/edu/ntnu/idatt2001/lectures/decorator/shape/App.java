package edu.ntnu.idatt2001.lectures.decorator.shape;

public class App {
  public static void main(String[] args) {

    Shape circle = new Circle();
    Shape rectangle = new Rectangle();

    Shape redCircle = new RedShapeDecorator(circle);

    Shape redRectangle = new RedShapeDecorator(rectangle);

    System.out.println("Circle with normal border");
    circle.draw();

    System.out.println("\nCircle of red border");
    redCircle.draw();

    System.out.println("\nRectangle of red border");
    redRectangle.draw();
  }
}