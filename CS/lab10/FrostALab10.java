
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class FrostALab10 extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button java = new Button();
        Button toggle = new Button();
        primaryStage.setTitle("bruh");
        java.setText("bruh");

    java.setLayoutX(60);
    java.setLayoutY(60);

    toggle.setText("on");
    toggle.setOnAction(new EventHandler<ActionEvent>() {

        @Override
        public void handle(ActionEvent event) {
            if (toggle.getText().equals("on")) {
                toggle.setText("off");
            } else if (toggle.getText().equals("off")) {
                toggle.setText("on");
            }
        }
    });

    java.setOnAction(new EventHandler<ActionEvent>() {

        @Override
        public void handle(ActionEvent event) {
            if (toggle.getText().equals("on")) {
            System.out.println("bruh");
            } 
        }
    });
    toggle.setLayoutX(60);
    toggle.setLayoutY(120);

    Pane root = new Pane();
    root.getChildren().add(java);
    root.getChildren().add(toggle);

    primaryStage.setScene(new Scene(root, 300, 300));
    primaryStage.show();
    }
}