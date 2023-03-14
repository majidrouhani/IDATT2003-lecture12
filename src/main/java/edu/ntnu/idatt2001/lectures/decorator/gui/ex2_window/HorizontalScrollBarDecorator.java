package edu.ntnu.idatt2001.lectures.decorator.gui.ex2_window;

import javafx.geometry.Orientation;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Represents a Horizontal scrollbar window decorator.
 */
class HorizontalScrollBarDecorator extends WindowDecorator {

  /**
   * Creates an instance of the HorizontalScrollBarDecorator.
   *
   * @param windowToBeDecorated the window to be decorated by the Horizontal
   *                            scrollbar.
   */
  public HorizontalScrollBarDecorator(Window windowToBeDecorated) {
    super(windowToBeDecorated);
  }

  @Override
  public void draw(Stage stage) {
    super.draw(stage);
    drawHorizontalScrollBar(stage);
  }

  @Override
  public String getDescription() {
    return super.getDescription() + ", including horizontal scrollbars";
  }

  /**
   * Draws the horizontal scrollbar onto the window to be decorated.
   */
  private void drawHorizontalScrollBar(Stage stage) {
    ScrollBar scrollBar = new ScrollBar();
    scrollBar.setOrientation(Orientation.HORIZONTAL);

    BorderPane borderPane = (BorderPane) stage.getScene().getRoot();
    borderPane.setBottom(scrollBar);

    stage.show();
  }
}
