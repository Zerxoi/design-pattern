package observer.manual.subject.impl;

import observer.manual.observer.Observer;
import observer.manual.subject.Subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherData implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    private final Random random = new Random();
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void registerObserver(observer.manual.observer.Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(observer.manual.observer.Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(float temperature, float humidity, float pressure) {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void measurementsChanged() {
        temperature = random.nextFloat();
        humidity = random.nextFloat();
        pressure = random.nextFloat();
        notifyObservers(temperature, humidity, pressure);
    }
}
