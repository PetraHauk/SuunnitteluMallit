package Factory_method.Map.Tiles;

import Factory_method.Map.Tile;

public class Water implements Tile {
    public char getCharacter() {
        return 'W';
    }

    public String getType() {
        return "Water";
    }

    public void action() {
        System.out.println("You are in the water");
    }
}
