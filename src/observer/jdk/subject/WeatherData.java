package observer.jdk.subject;

import java.util.Observable;
import java.util.Random;

public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    private final Random random = new Random();

    public float getTemperature() {
        return this.temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void measurementsChanged() {
        this.temperature = random.nextFloat();
        this.humidity = random.nextFloat();
        this.pressure = random.nextFloat();
        setChanged();
        notifyObservers();
    }

}
