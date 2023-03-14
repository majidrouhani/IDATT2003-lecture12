package edu.ntnu.idatt2001.lectures.decorator.gui.ex2_window;

import javafx.stage.Stage;

/**
 * Represents a window decorator. A window decorator implements the Window-interface
 * so it can be handled as any other window in the system.
 * A window decorator taks the windo to be decorated as a parameter of its constructor.
 */
abstract class WindowDecorator implements Window {
  // the Window to be decorated
  private final Window windowToBeDecorated;

  /**
   * Creates an instance of a window decorator, taking the window to be decorated
   * as parameter.
   *
   * @param windowToBeDecorated the window to be decorated.
   */
  protected WindowDecorator (Window windowToBeDecorated) {
    this.windowToBeDecorated = windowToBeDecorated;
  }

  @Override
  public void draw(Stage stage) {
    windowToBeDecorated.draw(stage); //Delegation
  }

  @Override
  public String getDescription() {
    return windowToBeDecorated.getDescription(); //Delegation
  }
}
