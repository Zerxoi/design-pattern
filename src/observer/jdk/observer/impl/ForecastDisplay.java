package observer.jdk.observer.impl;

import observer.jdk.observer.DisplayElement;

import java.util.Observable;
import java.util.Observer;


public class ForecastDisplay implements DisplayElement, Observer {
    @Override
    public void update(Observable o, Object arg) {
        display();
    }

    @Override
    public void display() {
        System.out.println("Forecast display");
    }
}
