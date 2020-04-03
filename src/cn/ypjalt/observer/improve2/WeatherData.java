package cn.ypjalt.observer.improve2;

import java.util.ArrayList;
import java.util.Observable;

public class WeatherData extends Observable {
    private float temperatrue;
    private float pressure;
    private float humidity;


    public WeatherData() {
    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();  // 没有数据对象,表示是拉
    }

    public void setMeasurements(float temperatrue, float pressure, float humidity) {
        this.temperatrue = temperatrue;
        this.pressure = pressure;
        this.humidity = humidity;
        measurementsChanged();
    }

    public float getTemperatrue() {
        return temperatrue;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }
}
