package Factory_method.Map.Tiles;

public class Road {
    public char getCharacter() {
        return 'R';
    }

    public String getType() {
        return "Road";
    }

    public void action() {
        System.out.println("You are on the road");
    }
}
