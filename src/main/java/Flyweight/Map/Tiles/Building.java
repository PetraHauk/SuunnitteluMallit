package Flyweight.Map.Tiles;

import Flyweight.Map.Tile;
import javafx.scene.paint.Color;

import java.util.Calendar;

public class Building implements Tile {
    public char getCharacter() {
        return 'B';
    }

    public Color getColor() {
        return Color.RED;
    }
    public void action() {
        System.out.println("You are in the building");
    }
}
