package Factory_method.Map;

public abstract class Map {

    abstract Tile createTile();

    public void display(int width, int height) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                Tile tile = createTile();
                System.out.print(tile.getCharacter() + " ");
            }
            System.out.println();
        }
    }
}
