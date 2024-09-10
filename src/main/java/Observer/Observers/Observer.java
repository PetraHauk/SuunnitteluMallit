package Observer.Observers;

import Observer.WeatherData;

public interface Observer {
    void update(WeatherData weatherData);
}
