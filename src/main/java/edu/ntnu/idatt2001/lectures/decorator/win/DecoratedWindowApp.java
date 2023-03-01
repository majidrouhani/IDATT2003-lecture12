package edu.ntnu.idatt2001.lectures.decorator.win;

public class DecoratedWindowApp {

  public static void main(String[] args) {
    // Creat a simple Window
    Window simpleWindow = new SimpleWindow();

    // Print the Window's description
    System.out.println(simpleWindow.getDescription());

    // Create a Window with horizontal and vertical scrollbars
    Window decoratedWindow = new VerticalScrollBarDecorator(
        new HorizontalScrollBarDecorator(new SimpleWindow()));

    // Print the Window's description
    System.out.println(decoratedWindow.getDescription());
  }
}
