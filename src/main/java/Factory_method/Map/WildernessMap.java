package Factory_method.Map;

import Factory_method.Map.Tiles.*;

import java.util.Random;

public class WildernessMap extends Map {
    private static final Tile[] wildernessTiles = new Tile[]{ (Tile) new Forest(), (Tile) new Swamp(), (Tile) new Water() };
    private Random random = new Random();

    public WildernessMap(int width, int height) {
        super(width, height);
    }

    @Override
    public Tile createTile() {
        return wildernessTiles[random.nextInt(wildernessTiles.length)];
    }
}
