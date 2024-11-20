package Flyweight.Map;

import javafx.scene.canvas.GraphicsContext;

public abstract class Map {

    // Abstract method to be implemented by subclasses for creating tiles
    public abstract Tile createTile(TileGraphicFactory factory);

    // Method to render the map using the tile factory
    public void render(GraphicsContext gc, int width, int height, int tileSize, TileGraphicFactory factory) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                // Use the factory to get the tile
                Tile tile = createTile(factory);
                gc.setFill(tile.getColor());
                gc.fillRect(i * tileSize, j * tileSize, tileSize, tileSize); // Draw the tile on the canvas
            }
        }
    }
}
