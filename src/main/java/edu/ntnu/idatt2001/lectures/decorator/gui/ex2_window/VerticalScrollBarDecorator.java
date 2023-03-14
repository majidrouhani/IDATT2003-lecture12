package edu.ntnu.idatt2001.lectures.decorator.gui.ex2_window;

import javafx.geometry.Orientation;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Represents a Vertical scrollbar window decorator.
 */
class VerticalScrollBarDecorator extends WindowDecorator {

  /**
   * Creates an instance of the VerticalScrollBarDecorator.
   *
   * @param windowToBeDecorated the window to be decorated by the Horizontal
   *                            scrollbar.
   */
  public VerticalScrollBarDecorator(Window windowToBeDecorated) {
    super(windowToBeDecorated);
  }

  @Override
  public void draw(Stage stage) {
    super.draw(stage);
    drawVerticalScrollBar(stage);
  }

  @Override
  public String getDescription() {
    return super.getDescription() + ", including vertical scrollbars";
  }

  /**
   * Draws the horizontal scrollbar onto the window to be decorated.
   */
  private void drawVerticalScrollBar(Stage stage) {
    ScrollBar scrollBar = new ScrollBar();
    scrollBar.setOrientation(Orientation.VERTICAL);

    BorderPane borderPane = (BorderPane) stage.getScene().getRoot();
    borderPane.setRight(scrollBar);

    stage.show();
  }
}
