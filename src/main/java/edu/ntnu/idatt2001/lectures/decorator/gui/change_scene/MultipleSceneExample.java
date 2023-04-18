package edu.ntnu.idatt2001.lectures.decorator.gui.change_scene;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MultipleSceneExample extends Application {
    EventHandler<ActionEvent> changeScene = null;
    Scene scene = null;

    @Override
    public void start(Stage primaryStage) throws Exception {

        changeScene = new EventHandler<>() {
            @Override
            public void handle(ActionEvent event) {
              if (event.getSource().getClass().getSimpleName().equals("Button")) {
                Button btn = (Button) event.getTarget();
                if ("Next >".equals(btn.getText())) {
                    scene = buildScene2(changeScene); 
                } else if ("< Previous".equals(btn.getText())) {
                    scene = buildScene1(changeScene); 
                }
                primaryStage.setScene(scene);
              }
            }
          };

        scene = buildScene1(changeScene); 

        primaryStage.setTitle("JavaFX Scene");
        primaryStage.setScene(scene);
        primaryStage.show();                
    }

      
    private Scene buildScene1(EventHandler<ActionEvent> changeScene) {
        GridPane rootNode = new GridPane();
        Scene thisScene = null;

        Button nextSceneBtn = new Button("Next >");
        nextSceneBtn.setOnAction(changeScene);    

        rootNode.add(nextSceneBtn, 0,0);
        thisScene = new Scene(rootNode, 500, 500);

        return thisScene;
    }

    private Scene buildScene2(EventHandler<ActionEvent> changeScene) {
        GridPane rootNode = new GridPane();
        Scene thisScene = null;

        Button nextSceneBtn = new Button("< Previous");
        nextSceneBtn.setOnAction(changeScene);    

        rootNode.add(nextSceneBtn, 0,0);
        thisScene = new Scene(rootNode, 500, 500);

        return thisScene;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
