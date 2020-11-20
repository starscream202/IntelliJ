package class27;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



public class GUIApplication extends Application {
    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Ash's First GUI Application");
        Button button=new Button("Click Here");
        StackPane stackPane=new StackPane();
        Scene scene =new Scene(stackPane,600,600);
        primaryStage.setScene(scene);
        stackPane.getChildren().add(button);
        primaryStage.show();
    }
}
