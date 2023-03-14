package edu.ntnu.idatt2001.lectures.decorator.gui.ex2_window;

import javafx.stage.Stage;

/**
 * An interface representing a Window.
 * A window can be drawn, and it has a description.
 */
public interface Window {
  /**
   * Draws the window onto the canvas.
   */
  void draw(Stage stage);

  /**
   * Returns the description of the window.
   * 
   * @return the description of the window.
   */
  String getDescription();
}
