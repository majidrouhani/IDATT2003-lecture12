package edu.ntnu.idatt2001.lectures.decorator.win;

/**
 * Represents a "simple" window, with no scroll bars or any other
 * additions (decorations).
 */
class SimpleWindow implements Window {

  @Override
  public void draw() {
    // Draw window
  }

  @Override
  public String getDescription() {
    return "simple window";
  }
}