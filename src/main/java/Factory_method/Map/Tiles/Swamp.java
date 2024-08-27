package Factory_method.Map.Tiles;

public class Swamp {
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
