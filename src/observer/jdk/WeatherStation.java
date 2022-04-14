package observer.jdk;

import observer.manual.observer.Observer;
import observer.manual.observer.impl.CurrentConditionDisplay;
import observer.manual.observer.impl.ForecastDisplay;
import observer.manual.observer.impl.StatisticsDisplay;
import observer.manual.subject.impl.WeatherData;

public class WeatherStation {
    public static void main(String[] args) throws InterruptedException {
        WeatherData weatherData = new WeatherData();
        Observer conditionObserver = new CurrentConditionDisplay();
        Observer forecastObserver = new ForecastDisplay();
        Observer statisticsObserver = new StatisticsDisplay();
        weatherData.registerObserver(conditionObserver);
        weatherData.registerObserver(forecastObserver);
        weatherData.registerObserver(statisticsObserver);
        weatherData.measurementsChanged();
        Thread.sleep(1000);
        weatherData.removeObserver(forecastObserver);
        weatherData.measurementsChanged();
    }
}
