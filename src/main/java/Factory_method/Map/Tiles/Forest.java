package Factory_method.Map.Tiles;

import Factory_method.Map.Tile;

public class Forest implements Tile {
    public char getCharacter() {
        return 'F';
    }

    public String getType() {
        return "Forest";
    }

    public void action() {
        System.out.println("You are in the forest");
    }
}
