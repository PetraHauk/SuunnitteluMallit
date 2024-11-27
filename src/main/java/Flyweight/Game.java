package Flyweight;

import Flyweight.Map.CityMap;
import Flyweight.Map.Map;
import Flyweight.Map.WildernessMap;
import Flyweight.Map.TileGraphicFactory;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Game extends Application {
    private static final int TILE_SIZE = 20;
    private static final int MAP_WIDTH = 20;
    private static final int MAP_HEIGHT = 20;

    private Canvas canvas;
    private GraphicsContext gc;
    private TileGraphicFactory factory;

    @Override
    public void start(Stage primaryStage) {
        canvas = new Canvas(MAP_WIDTH * TILE_SIZE, MAP_HEIGHT * TILE_SIZE);
        gc = canvas.getGraphicsContext2D();

        factory = new TileGraphicFactory();

        Button cityMapButton = new Button("City Map");
        cityMapButton.setOnAction(e -> renderMap("city"));

        Button wildernessMapButton = new Button("Wilderness Map");
        wildernessMapButton.setOnAction(e -> renderMap("wilderness"));

        VBox buttonBox = new VBox(10);
        buttonBox.getChildren().addAll(cityMapButton, wildernessMapButton);

        StackPane root = new StackPane();
        VBox layout = new VBox(20);
        layout.getChildren().addAll(canvas, buttonBox);

        root.getChildren().add(layout);

        Scene scene = new Scene(root);
        primaryStage.setTitle("Flyweight Pattern Example");
        primaryStage.setScene(scene);
        primaryStage.show();

        renderMap("wilderness");
    }

    private void renderMap(String mapType) {
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());

        Map map = createMap(mapType);
        if (map != null) {
            map.render(gc, MAP_WIDTH, MAP_HEIGHT, TILE_SIZE, factory);
        }
    }

    public Map createMap(String mapType) {
        if (mapType.equals("city")) {
            return new CityMap();
        } else if (mapType.equals("wilderness")) {
            return new WildernessMap();
        } else {
            System.out.println("Invalid map type");
            return null;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
