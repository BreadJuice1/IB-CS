
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
        java.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("bruh");
            }
        });
    java.setLayoutX(60);
    java.setLayoutY(60);

    toggle.setText("bruh");
    toggle.setOnAction(new EventHandler<ActionEvent>() {

        @Override
        public void handle(ActionEvent event) {
            if (toggle.getText().equals("bruh")) {
                toggle.setText("breh");
            } else if (toggle.getText().equals("breh")) {
                toggle.setText("bruh");
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