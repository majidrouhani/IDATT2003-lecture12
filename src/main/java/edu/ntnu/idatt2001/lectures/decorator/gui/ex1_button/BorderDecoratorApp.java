package edu.ntnu.idatt2001.lectures.decorator.gui.ex1_button;

import javafx.application.Application;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


// Usage
public class BorderDecoratorApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        // create a button
        UIElement button = new ButtonComponent("Click me");
        button.draw(primaryStage);

        // add a border to the button
        UIElement borderedButton = new BorderDecorator(button, Color.RED);
        borderedButton.draw(primaryStage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}