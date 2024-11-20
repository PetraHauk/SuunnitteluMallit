package Flyweight.Map.Tiles;

import Flyweight.Map.Tile;
import javafx.scene.paint.Color;

public class Road implements Tile {
    public char getCharacter() {
        return 'R';
    }

    public Color getColor() {
        return Color.BROWN;
    }

    public void action() {
        System.out.println("You are on the road");
    }
}
