package Observer;

public class WeatherData {
    private final float temperature;

    public WeatherData(float temperature) {
        this.temperature = temperature;
    }

    public float getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "WeatherData temperature=" + temperature;
    }
}
