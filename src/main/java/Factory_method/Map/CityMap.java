package Factory_method.Map;

import Factory_method.Map.Tiles.Building;
import Factory_method.Map.Tiles.Forest;
import Factory_method.Map.Tiles.Road;

import java.util.Random;

public class CityMap extends Map {
    private Random random = new Random();

    @Override
    public Tile createTile() {
        int randomInt = random.nextInt(3);
        switch (randomInt) {
            case 0:
                return new Building();
            case 1:
                return new Road();
            case 2:
                return new Forest();
            default:
                return null;
        }
    }
}
