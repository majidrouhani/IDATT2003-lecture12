package edu.ntnu.idatt2001.lectures.decorator.gui;

import javafx.scene.paint.Color;
import javafx.stage.Stage;

// Concrete decorator
class BorderDecorator extends UIElementDecorator {
    private Color borderColor;

    public BorderDecorator(UIElement decoratedElement, Color borderColor) {
        super(decoratedElement);
        this.borderColor = borderColor;
    }

    @Override
    public void draw(Stage stage) {
        super.draw(stage);
        stage.getScene().getRoot().setStyle("-fx-border-color: " + borderColor.toString().replace("0x", "#") + "; -fx-border-width: 5px;");
        stage.show();
    }
}
