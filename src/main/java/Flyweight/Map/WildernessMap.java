package Flyweight.Map;

import java.util.Random;

public class WildernessMap extends Map {
    private Random random = new Random();

    @Override
    public Tile createTile(TileGraphicFactory factory) {
        int randomInt = random.nextInt(3);
        switch (randomInt) {
            case 0:
                return factory.getTile("Water");
            case 1:
                return factory.getTile("Swamp");
            default:
                return factory.getTile("Forest");
        }
    }
}
