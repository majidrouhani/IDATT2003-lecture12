package edu.ntnu.idatt2001.lectures.decorator.win;

/**
 * An interface representing a Window.
 * A window can be drawn, and it has a description.
 */
public interface Window {
  /**
   * Draws the window onto the canvas.
   */
  void draw();

  /**
   * Returns the description of the window.
   * @return the description of the window.
   */
  String getDescription();
}
