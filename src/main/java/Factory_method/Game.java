package Factory_method;

import Factory_method.Map.CityMap;
import Factory_method.Map.WildernessMap;
import Factory_method.Map.Map;

public class Game {

    public static void main(String[] args) {
        Game game = new Game();

        System.out.println("City Map:");
        Map cityMap = game.createMap("city");
        cityMap.display(5,5);

        System.out.println();
        System.out.println("Wilderness Map:");
        Map wildernessMap = game.createMap("wilderness");
        wildernessMap.display(5,5);
    }

    public Map createMap(String mapType) {
        if (mapType.equals("city")) {
            return new CityMap();
        } else if (mapType.equals("wilderness")) {
            return new WildernessMap();
        } else {
            System.out.println("Invalid map type");
            return null;
        }
    }
}
