package edu.ntnu.idatt2001.lectures.decorator.gui.ex2_window;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Represents a "simple" window, with no scroll bars or any other
 * additions (decorations).
 */
class SimpleWindow implements Window {

  @Override
  public void draw(Stage stage) {
    BorderPane borderPane = new BorderPane();
    Scene scene = new Scene(borderPane, 600, 600);
    stage.setScene(scene);
    stage.show();
  }

  @Override
  public String getDescription() {
    return "simple window";
  }
}