import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.*;
import javafx.scene.Node;
import javafx.scene.paint.Paint;
import javafx.scene.text.Text;

public class FrostALab11 extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Circle fillCircle = new Circle();
        Circle emptyCircle = new Circle();
        Rectangle fillRectangle = new Rectangle();
        Rectangle emptyRectangle = new Rectangle();
        Scale scale = new Scale(1, 1);
        Text text = new Text("bruh");
        Line line = new Line(10, 10, 200, 10);
        Button scaleBtn = new Button();
        Button colourBtn = new Button();
        primaryStage.setTitle("FrostALab11");
        scaleBtn.setText("scale");
        colourBtn.setText("colour");

        text.setLayoutX(150);
        text.setLayoutY(300);

        scaleBtn.setLayoutX(150);

        colourBtn.setLayoutX(200);

        scaleBtn.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                text.setText("breh");
                if (scale.getX() == 1) {
                    scale.setX(.25);
                    scale.setY(.25);
                } else if (scale.getX() == .25) {
                    scale.setX(.5);
                    scale.setY(.5);
                } else if (scale.getX() == .5) {
                    scale.setX(1);
                    scale.setY(1);
                }
            }
        });

        line.setStroke(Color.BLACK);
        line.setStrokeWidth(10);
        line.setStrokeLineCap(StrokeLineCap.BUTT);

        Pane buttonPane = new Pane();
        buttonPane.getChildren().addAll(colourBtn, scaleBtn);

        Pane drawingPane = new Pane();
        drawingPane.getTransforms().addAll(scale);
        drawingPane.getChildren().addAll(line, text);

        VBox root = new VBox();
        root.getChildren().addAll(drawingPane, buttonPane);

        primaryStage.setScene(new Scene(root, 400, 400));
        primaryStage.show();
    }
}