package Flyweight.Map;

import java.util.Random;

public class CityMap extends Map {
    private Random random = new Random();

    @Override
    public Tile createTile(TileGraphicFactory factory) {
        // Randomly choose a tile type from city-specific tiles
        int randomInt = random.nextInt(3);  // 3 possible tile types in the city map
        switch (randomInt) {
            case 0:
                return factory.getTile("Building");
            case 1:
                return factory.getTile("Road");
            default:
                return factory.getTile("Forest");  // Default tile type
        }
    }
}
