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
    private static final int MAP_WIDTH = 10;
    private static final int MAP_HEIGHT = 10;

    private Canvas canvas;
    private GraphicsContext gc;
    private TileGraphicFactory factory;

    @Override
    public void start(Stage primaryStage) {
        // Increase canvas size to fit the map
        canvas = new Canvas(MAP_WIDTH * TILE_SIZE, MAP_HEIGHT * TILE_SIZE);
        gc = canvas.getGraphicsContext2D();

        // Tile graphic factory to manage tile objects
        factory = new TileGraphicFactory();

        // Set up buttons to switch between maps
        Button cityMapButton = new Button("City Map");
        cityMapButton.setOnAction(e -> renderMap("city"));

        Button wildernessMapButton = new Button("Wilderness Map");
        wildernessMapButton.setOnAction(e -> renderMap("wilderness"));

        // Set the spacing between buttons
        VBox buttonBox = new VBox(10);  // 10 pixels spacing between buttons
        buttonBox.getChildren().addAll(cityMapButton, wildernessMapButton);

        // Set up the root layout to place the canvas and buttons
        StackPane root = new StackPane();
        VBox layout = new VBox(20);  // 20 pixels spacing between the canvas and buttons
        layout.getChildren().addAll(canvas, buttonBox);  // Add the canvas and button box to the layout

        root.getChildren().add(layout);

        // Scene setup
        Scene scene = new Scene(root);
        primaryStage.setTitle("Flyweight Pattern Example");
        primaryStage.setScene(scene);
        primaryStage.show();

        // Initially display the Wilderness Map (or default map)
        renderMap("wilderness");
    }

    // Method to render the selected map
    private void renderMap(String mapType) {
        // Clear the canvas to prepare for new map rendering
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());

        Map map = createMap(mapType);  // Create the corresponding map
        if (map != null) {
            map.render(gc, MAP_WIDTH, MAP_HEIGHT, TILE_SIZE, factory);  // Render the map with the factory
        }
    }

    // Method to create a map based on the map type
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
