package Observer.Observers;

import Observer.WeatherData;
public class Termostat implements Observer {

    @Override
    public void update(WeatherData weatherData) {
        float temperature = weatherData.getTemperature();
        if (temperature < 18) {
            System.out.printf("Thermostat: %.1f°C | It's cold! Turning up the heat. \n", temperature);
        } else if (temperature > 24) {
            System.out.printf("Thermostat: %.1f°C | It´s warm! Turning on the air conditioning. \n", temperature);
        } else {
            System.out.printf("Thermostat: %.1f°C | Temperature is comfortable. No adjustments needed. \n", temperature);
        }
    }
}