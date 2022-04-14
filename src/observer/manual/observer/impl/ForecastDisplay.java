package observer.manual.observer.impl;

import observer.manual.observer.DisplayElement;
import observer.manual.observer.Observer;

public class ForecastDisplay implements DisplayElement, Observer {
    @Override
    public void display() {
        System.out.println("Forecast display");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        display();
    }
}
