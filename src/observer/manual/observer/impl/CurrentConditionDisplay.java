package observer.manual.observer.impl;

import observer.manual.observer.DisplayElement;
import observer.manual.observer.Observer;

public class CurrentConditionDisplay implements DisplayElement, Observer {
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void display() {
        System.out.println("Current condition display:\n" + "Temperature: " + temperature + "\nHumidity: " + humidity + "\nPressure: " + pressure);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) { // 主题推送数据
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
