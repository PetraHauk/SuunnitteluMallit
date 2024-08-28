package Factory_method.Map.Tiles;

import Factory_method.Map.Tile;

public class Building implements Tile {
    public char getCharacter() {
        return 'B';
    }

    public String getType() {
        return "Building";
    }

    public void action() {
        System.out.println("You are in the building");
    }
}
