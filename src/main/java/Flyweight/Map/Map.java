package Flyweight.Map;

import javafx.scene.canvas.GraphicsContext;

public abstract class Map {

    public abstract Tile createTile(TileGraphicFactory factory);

    public void render(GraphicsContext gc, int width, int height, int tileSize, TileGraphicFactory factory) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                Tile tile = createTile(factory);
                gc.setFill(tile.getColor());
                gc.fillRect(i * tileSize, j * tileSize, tileSize, tileSize);
            }
        }
    }
}
