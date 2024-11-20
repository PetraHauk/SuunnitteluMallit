package Flyweight.Map.Tiles;

import Flyweight.Map.Tile;
import javafx.scene.paint.Color;

public class Forest implements Tile {
    public char getCharacter() {
        return 'F';
    }

    public Color getColor() {
        return Color.GREEN;
    }

    public void action() {
        System.out.println("You are in the forest");
    }
}
