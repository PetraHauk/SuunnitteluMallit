package Factory_method.Map.Tiles;

import Factory_method.Map.Tile;

public class Road implements Tile {
    public char getCharacter() {
        return 'R';
    }

    public String getType() {
        return "Road";
    }

    public void action() {
        System.out.println("You are on the road");
    }
}
