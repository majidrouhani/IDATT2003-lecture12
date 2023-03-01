package edu.ntnu.idatt2001.lectures.decorator.icecream;

abstract class IcecreamDecorator implements Icecream {

  protected Icecream specialIcecream;

  protected IcecreamDecorator(Icecream specialIcecream) {
    this.specialIcecream = specialIcecream;
  }

  public String makeIcecream() {
    return specialIcecream.makeIcecream();
  }
}