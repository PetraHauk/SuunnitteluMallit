package Flyweight.Map.Tiles;

import Flyweight.Map.Tile;
import javafx.scene.paint.Color;

public class Swamp implements Tile {
    public char getCharacter() {
        return 'S';
    }

    public Color getColor() {
        return Color.TURQUOISE;
    }

    public void action() {
        System.out.println("You are in the swamp");
    }
}
