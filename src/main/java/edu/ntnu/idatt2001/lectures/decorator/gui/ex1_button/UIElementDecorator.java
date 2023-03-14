package edu.ntnu.idatt2001.lectures.decorator.gui.ex1_button;

import javafx.stage.Stage;

// Decorator
abstract class UIElementDecorator implements UIElement {
    protected UIElement decoratedElement;

    protected UIElementDecorator(UIElement decoratedElement) {
        this.decoratedElement = decoratedElement;
    }

    public void draw(Stage stage) {
        decoratedElement.draw(stage);
    }
}
