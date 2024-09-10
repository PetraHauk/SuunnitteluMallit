package Observer.Observers;

import Observer.WeatherData;

public class Phone implements Observer {

    @Override
    public void update(WeatherData weatherData) {
        System.out.println("Phone: The temperature is now " + weatherData.getTemperature() + "°C \n");
    }
}
