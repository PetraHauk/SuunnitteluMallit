package Factory_method.Map;

abstract class Map {
    int width;
    int height;
    Tile[][] tiles;

    public Map(int width, int height) {
        this.width = width;  // Correctly initialize instance variable
        this.height = height;
        tiles = new Tile[width][height];
    }

    abstract Tile createTile();

    public void display() {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                tiles[i][j] = createTile();
                System.out.print(tiles[i][j].getCharacter());
            }
            System.out.println();
        }
    }
}
