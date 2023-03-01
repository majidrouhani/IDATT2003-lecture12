package edu.ntnu.idatt2001.lectures.decorator.win;

/**
 * Represents a Horizontal scrollbar window decorator.
 */
class HorizontalScrollBarDecorator extends WindowDecorator {

  /**
   * Creates an instance of the HorizontalScrollBarDecorator.
   *
   * @param windowToBeDecorated the window to be decorated by the Horizontal scrollbar.
   */
  public HorizontalScrollBarDecorator(Window windowToBeDecorated) {
    super(windowToBeDecorated);
  }

  @Override
  public void draw() {
    super.draw();
    drawHorizontalScrollBar();
  }

  @Override
  public String getDescription() {
    return super.getDescription() + ", including horizontal scrollbars";
  }

  /**
   * Draws the horizontal scrollbar onto the window to be decorated.
   */
  private void drawHorizontalScrollBar() {
    // Draw the horizontal scrollbar
  }
}
