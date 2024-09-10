package Observer;

import Observer.Observers.Phone;
import Observer.Observers.Termostat;

public class Main {

        public static void main(String[] args) throws InterruptedException {
            WeatherStation weatherStation = new WeatherStation();

            Termostat termostat = new Termostat();
            Phone phone = new Phone();

            weatherStation.registerObserver(termostat);
            weatherStation.registerObserver(phone);

            Thread stationThread = new Thread(weatherStation);
            stationThread.start();

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            weatherStation.removeObserver(termostat);

            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            weatherStation.stop();
            stationThread.join();
        }
}
