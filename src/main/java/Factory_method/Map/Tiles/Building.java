package Factory_method.Map.Tiles;

public class Building {
    public char getCharacter() {
        return 'B';
    }

    public String getType() {
        return "Building";
    }

    public void action() {
        System.out.println("You are in the building");
    }
}
