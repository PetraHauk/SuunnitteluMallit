package Abstract_Factory;

import Abstract_Factory.UIFactory.UIFactory;
import Abstract_Factory.UIFactory.UIFactoryA;
import Abstract_Factory.UIFactory.UIFactoryB;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import Abstract_Factory.Buttons.Button;
import Abstract_Factory.Checkbox.Checkbox;
import Abstract_Factory.TextField.TextField;

public class GUI extends Application {

    private GraphicsContext gc;
    @Override
    public void start(Stage primaryStage) {
        UIFactory factory = new UIFactoryA();  // or UIFactoryB

        Canvas canvas = factory.createCanvas();
        StackPane root = new StackPane();
        root.getChildren().add(canvas);

        // Create and add UI elements
        Button button = factory.createButton("Click me!");
        Checkbox checkbox = factory.createCheckbox("Hello World!");
        TextField textField = factory.createTextField("Enter text here");

        root.getChildren().addAll(button, checkbox, textField);

        // Set up the scene and stage
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Abstract Factory Example");
        primaryStage.show();
    }
}
