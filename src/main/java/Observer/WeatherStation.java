package Observer;

import Observer.Observers.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherStation implements Runnable {
    private List<Observer> observers = new ArrayList<>();
    private final Random random = new Random();
    private boolean running = true;
    private float temperature;

    public WeatherStation() {
        this.temperature = random.nextFloat() * 100;
    }

    @Override
    public void run() {
        while (running) {
            updateWeather();

            try {
                Thread.sleep((random.nextInt(5) + 1) * 1000); // Sleep for 1-5 seconds
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void stop() {
        running = false;
    }

    private void updateWeather() {
        temperature += (random.nextFloat() * 10) - 5;

        WeatherData weatherData = new WeatherData(temperature);
        System.out.println("Weather Station: " + weatherData);

        // Notify all observers with the updated temperature
        notifyObservers(weatherData);
    }

    private void notifyObservers(WeatherData weatherData) {
        for (Observer observer : observers) {
            observer.update(weatherData);
        }
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver
            (Observer observer) {
        observers.remove(observer);
    }
}