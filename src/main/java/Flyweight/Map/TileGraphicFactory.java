package Flyweight.Map;

import Flyweight.Map.Tiles.Building;
import Flyweight.Map.Tiles.Forest;
import Flyweight.Map.Tiles.Road;
import Flyweight.Map.Tiles.Swamp;
import Flyweight.Map.Tiles.Water;

import java.util.HashMap;
import java.util.Map;

public class TileGraphicFactory {
    private Map<String, Tile> tileCache = new HashMap<>();

    // Fetch tile from cache or create a new one
    public Tile getTile(String type) {
        Tile tile = tileCache.get(type);
        if (tile == null) {
            // Instantiate and store the new tile if it's not cached
            switch (type) {
                case "Building":
                    tile = new Building();
                    break;
                case "Road":
                    tile = new Road();
                    break;
                case "Forest":
                    tile = new Forest();
                    break;
                case "Water":
                    tile = new Water();
                    break;
                case "Swamp":
                    tile = new Swamp();
                    break;
                default:
                    throw new IllegalArgumentException("Unknown tile type: " + type);
            }
            tileCache.put(type, tile);
        }
        return tile;
    }
}
