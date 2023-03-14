package edu.ntnu.idatt2001.lectures.decorator.gui.ex2_window;

import javafx.application.Application;
import javafx.stage.Stage;

public class DecoratedWindowApp extends Application {

  @Override
  public void start(Stage primaryStage) {
    // Creat a simple Window
    Window simpleWindow = new SimpleWindow();
    simpleWindow.draw(primaryStage);

    // Print the Window's description
    System.out.println(simpleWindow.getDescription());

    // Create a Window with horizontal and vertical scrollbars
    Window decoratedWindow = new VerticalScrollBarDecorator(
        new HorizontalScrollBarDecorator(new SimpleWindow()));
    decoratedWindow.draw(primaryStage);

    // Print the Window's description
    System.out.println(decoratedWindow.getDescription());
  }

  public static void main(String[] args) {
    launch(args);
  }
}
