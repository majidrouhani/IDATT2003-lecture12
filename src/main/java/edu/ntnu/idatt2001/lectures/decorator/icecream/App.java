package edu.ntnu.idatt2001.lectures.decorator.icecream;


public class App {

  public static void main(String args[]) {

    Icecream simpleIcecream = new SimpleIcecream();
    System.out.println(simpleIcecream.makeIcecream());

    Icecream nuttyIcecream = new NuttyDecorator(simpleIcecream);
    System.out.println(nuttyIcecream.makeIcecream());

    Icecream honeyIcecream = new HoneyDecorator(simpleIcecream);
    System.out.println(honeyIcecream.makeIcecream());

    Icecream honeyNuttyIcecream = new HoneyDecorator(new NuttyDecorator(new SimpleIcecream()));
    System.out.println(honeyNuttyIcecream.makeIcecream());
  }
}
