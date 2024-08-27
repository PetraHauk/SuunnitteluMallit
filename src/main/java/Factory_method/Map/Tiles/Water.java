package Factory_method.Map.Tiles;

public class Water {
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
