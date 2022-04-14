package observer.manual.subject;

import observer.manual.observer.Observer;

public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(float temperature, float humidity, float pressure);
}
