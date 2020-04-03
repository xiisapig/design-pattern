package cn.ypjalt.observer.improve;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private float temperatrue;
    private float pressure;
    private float humidity;
    private CurrentConditions currentConditions;
    // 观察者集合
    private ArrayList<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public float getTemperature() {
        return temperatrue;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void dataChange() {
       notifyObserver();
    }

    public void setData(float temperature, float pressure, float humidity) {
        this.temperatrue = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (observers.contains(o))
            observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(int i = 0; i < observers.size(); i++) {
            observers.get(i).update(this.temperatrue, this.pressure, this.humidity);
        }
    }
}
