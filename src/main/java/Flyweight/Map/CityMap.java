package Flyweight.Map;

import java.util.Random;

public class CityMap extends Map {
    private Random random = new Random();

    @Override
    public Tile createTile(TileGraphicFactory factory) {
        int randomInt = random.nextInt(3);
        switch (randomInt) {
            case 0:
                return factory.getTile("Building");
            case 1:
                return factory.getTile("Road");
            default:
                return factory.getTile("Forest");
        }
    }
}
