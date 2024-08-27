package Factory_method.Map;

import Factory_method.Map.Tiles.*;

import java.util.Random;

public class WildernessMap extends Map {
    private static final Tile[] wildernessTiles = new Tile[]{ new Forest(), new Swamp(), new Water() };
    private Random random = new Random();

    public WildernessMap() {
        super(width, height);
    }

    @Override
    public Tile createTile() {
        return wildernessTiles[random.nextInt(wildernessTiles.length)];
    }
}
