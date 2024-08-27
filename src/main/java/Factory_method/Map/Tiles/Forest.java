package Factory_method.Map.Tiles;

public class Forest {
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
