package observer.jdk.observer.impl;

import observer.jdk.observer.DisplayElement;
import observer.jdk.subject.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements DisplayElement, Observer {
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void update(Observable o, Object arg) { // 观察者拉数据
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            temperature = weatherData.getTemperature();
            humidity = weatherData.getHumidity();
            pressure = weatherData.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current condition display:\n" + "Temperature: " + temperature + "\nHumidity: " + humidity + "\nPressure: " + pressure);
    }
}
