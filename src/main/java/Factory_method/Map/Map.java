package Factory_method.Map;

abstract class Map {
    int width;
    int height;
    Tile[][] tiles;

    public Map() {
        width = 10;
        height = 10;
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
