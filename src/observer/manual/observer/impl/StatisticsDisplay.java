package observer.manual.observer.impl;

import observer.manual.observer.DisplayElement;
import observer.manual.observer.Observer;

public class StatisticsDisplay implements DisplayElement, Observer {
    @Override
    public void display() {
        System.out.println("Statistics display");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        display();
    }
}
