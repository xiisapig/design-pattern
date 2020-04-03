package cn.ypjalt.observer.improve2;


import java.util.Observable;
import java.util.Observer;

public class CurrentConditions implements Observer {
    private float temperature;
    private float presure;
    private float humidity;
    Observable observable;

    public CurrentConditions(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void display() {
        System.out.println("temperature: " + temperature);
        System.out.println("presure: " + presure);
        System.out.println("humidity: " + humidity);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperatrue();
            this.humidity = weatherData.getHumidity();
            this.presure = weatherData.getPressure();
            display();
        }
    }
}
