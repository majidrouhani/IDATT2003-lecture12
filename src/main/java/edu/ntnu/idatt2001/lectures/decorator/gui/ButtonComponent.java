package edu.ntnu.idatt2001.lectures.decorator.gui;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

// Concrete component
class ButtonComponent implements UIElement {
    private Button button;

    public ButtonComponent(String text) {
        this.button = new Button(text);
    }

    public void draw(Stage stage) {
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(button);
        Scene scene = new Scene(borderPane, 200, 100);
        stage.setScene(scene);
        stage.show();
    }
}
