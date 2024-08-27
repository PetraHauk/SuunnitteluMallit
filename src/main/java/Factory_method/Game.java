package Factory_method;

import Factory_method.Map.CityMap;
import Factory_method.Map.WildernessMap;

import java.util.Map;

public class Game {

    public static void main(String[] args) {
        Game game = new Game();
        System.out.println("City Map:");
        Map cityMap = game.createMap("city", 5, 5);
        cityMap.display();

        System.out.println("Wilderness Map:");
        Map wildernessMap = game.createMap("wilderness", 5, 5);
        wildernessMap.display();
    }

    public Map createMap(String mapType, int width, int height) {
        if (mapType.equals("city")) {
            return new CityMap(width, height);
        } else if (mapType.equals("wilderness")) {
            return new WildernessMap(width, height);
        } else {
            System.out.println("Invalid map type");
            return null;
        }
    }
}
