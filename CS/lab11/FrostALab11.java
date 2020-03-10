import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
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
    public void start (Stage primaryStage) {
        Scale scale;
        Line line = new Line(10, 10, 200, 10);
        Button scaleBtn = new Button();
        Button colourBtn = new Button();
        primaryStage.setTitle("FrostALab11");
        scaleBtn.setText("scale");
        colourBtn.setText("colour");
    
    scaleBtn.setLayoutX(150);
    scaleBtn.setLayoutY(350);

    colourBtn.setLayoutX(250);
    colourBtn.setLayoutY(350);
    
    line.setStroke(Color.BLACK);
    line.setStrokeWidth(10);        
    line.setStrokeLineCap(StrokeLineCap.BUTT);

    Pane root = new Pane();
    root.getChildren().add(line);
    root.getChildren().add(colourBtn);
    root.getChildren().add(scaleBtn);

    primaryStage.setScene(new Scene(root, 400, 400));
    primaryStage.show();
    }
}