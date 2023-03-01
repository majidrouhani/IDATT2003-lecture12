package edu.ntnu.idatt2001.lectures.decorator.win;

/**
 * Represents a Vertical scrollbar window decorator.
 */
class VerticalScrollBarDecorator extends WindowDecorator {

  /**
   * Creates an instance of the VerticalScrollBarDecorator.
   *
   * @param windowToBeDecorated the window to be decorated by the Horizontal scrollbar.
   */
  public VerticalScrollBarDecorator (Window windowToBeDecorated) {
    super(windowToBeDecorated);
  }

  @Override
  public void draw() {
    super.draw();
    drawVerticalScrollBar();
  }

  @Override
  public String getDescription() {
    return super.getDescription() + ", including vertical scrollbars";
  }

  /**
   * Draws the horizontal scrollbar onto the window to be decorated.
   */
  private void drawVerticalScrollBar() {
    // Draw the vertical scrollbar
  }
}
