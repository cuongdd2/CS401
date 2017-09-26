package lesson6;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HWJavaFX extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception {
    primaryStage.setTitle("JavaFX demo");
    Button btn = new Button("Click me!");
    StackPane group = new StackPane(btn);
    btn.setOnMouseClicked(event -> {
      System.out.println("clclkcc");
    });
    primaryStage.setScene(new Scene(group));
    primaryStage.show();
  }
}
