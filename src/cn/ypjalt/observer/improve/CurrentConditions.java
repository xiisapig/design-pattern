package cn.ypjalt.observer.improve;


public class CurrentConditions implements Observer{
    private float temperature;
    private float presure;
    private float humidity;

    public void update(float temperature, float presure, float humidity) {
        this.temperature = temperature;
        this.presure = presure;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("temperature: " + temperature);
        System.out.println("presure: " + presure);
        System.out.println("humidity: " + humidity);
    }
}
