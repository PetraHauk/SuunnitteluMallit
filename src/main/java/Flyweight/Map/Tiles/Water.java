package Flyweight.Map.Tiles;

import Flyweight.Map.Tile;
import javafx.scene.paint.Color;

import java.util.Calendar;

public class Water implements Tile {
    public char getCharacter() {
        return 'W';
    }

    public Color getColor() {
        return Color.BLUE;
    }
    public void action() {
        System.out.println("You are in the water");
    }
}
