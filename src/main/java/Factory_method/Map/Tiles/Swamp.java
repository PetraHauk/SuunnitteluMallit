package Factory_method.Map.Tiles;

import Factory_method.Map.Tile;

public class Swamp implements Tile {
    public char getCharacter() {
        return 'S';
    }

    public String getType() {
        return "Swamp";
    }

    public void action() {
        System.out.println("You are in the swamp");
    }
}
