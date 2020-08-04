import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;

public class test extends Application {
    public void start(Stage primaryStage) {
        
        // Set up
        Button btOk = new Button("Ok");
        Scene scene = new Scene(btOk, 200, 250);
        primaryStage.setTitle("MyJavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
         
        // Creates panes
        StackPane pane = new StackPane();
        pane.getChildren().add(new Button("Ok"));
        Scene scene = new Scene(pane, 200, 50);
        primaryStage.setTitle("Button");
        primaryStage.setScene(scene);
        primaryStage.show();
         */
        // Binding
        Pane pane = new Pane();
        Circle circle = new Circle();
        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
        pane.getChildren().add(circle);
        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setTitle("bruh");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        FlowPane pane = new FlowPane();
        pane.setPadding(new Insets(11,12,13,14));
        pane.setHgap(5);
        pane.setVgap(5);
        pane.getChildren().addAll(new Label("first:"), new TextField(), new Label("MI:"));
        TextField tfMi = new TextField();
        tfMi.setPrefColumnCount(1);
        pane.getChildren().addAll(tfMi, new Label("Last Name:"), new TextField());
        Scene scene = new Scene(pane, 200, 250);
        primaryStage.setTitle("bruh");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
