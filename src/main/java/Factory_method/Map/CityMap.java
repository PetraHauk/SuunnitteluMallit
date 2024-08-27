package Factory_method.Map;

import Factory_method.Map.Tiles.Building;
import Factory_method.Map.Tiles.Forest;
import Factory_method.Map.Tiles.Road;

import java.util.Random;

public class CityMap extends Map {
    private static final Tile[] cityTiles = { new Road(), new Building(), new Forest() };
    private Random random = new Random();

    public CityMap(int width, int height) {
        super(width, height);
    }

    @Override
    public Tile createTile() {
        return cityTiles[random.nextInt(cityTiles.length)];
    }
}
