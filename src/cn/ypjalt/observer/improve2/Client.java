package cn.ypjalt.observer.improve2;

public class Client {
    public static void main(String[] args) {
        System.out.println("~~观察者模式继承api模式~~");
        // 创建一个WeatherData
        WeatherData weatherData = new WeatherData();
        // 创建观察者
        CurrentConditions currentConditions = new CurrentConditions(weatherData);
        CurrentConditions currentConditions2 = new CurrentConditions(weatherData);

        System.out.println("通知各个注册的观察者,看看信息");
        weatherData.setMeasurements(10f, 20f, 40f);
    }
}
