package edu.ntnu.idatt2001.lectures.decorator.icecream;

public class HoneyDecorator extends IcecreamDecorator {

  public HoneyDecorator(Icecream specialIcecream) {
    super(specialIcecream);
  }

  @Override
  public String makeIcecream() {
    return specialIcecream.makeIcecream() + addHoney();
  }

  private String addHoney() {
    return " + sweet honey";
  }
}