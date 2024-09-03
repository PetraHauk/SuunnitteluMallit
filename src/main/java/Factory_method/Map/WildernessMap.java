package Factory_method.Map;

import Factory_method.Map.Tiles.*;

import java.util.Random;

public class WildernessMap extends Map {
    private Random random = new Random();
    @Override
    public Tile createTile() {
        int randomInt = random.nextInt(3);
        switch (randomInt) {
            case 0:
                return new Swamp();
            case 1:
                return new Water();
            case 2:
                return new Forest();
            default:
                return null;
        }
    }
}
