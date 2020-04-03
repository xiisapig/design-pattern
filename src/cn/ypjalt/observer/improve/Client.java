package cn.ypjalt.observer.improve;

public class Client {
    public static void main(String[] args) {
        System.out.println("~~观察者模式~~");
        // 创建一个WeatherData
        WeatherData weatherData = new WeatherData();
        // 创建观察者
        CurrentConditions currentConditions = new CurrentConditions();
        CurrentConditions currentConditions2 = new CurrentConditions();
        // 注册到WeatherData
        weatherData.registerObserver(currentConditions);
        weatherData.registerObserver(currentConditions2);

        System.out.println("通知各个注册的观察者,看看信息");
        weatherData.setData(10f, 20f, 40f);
    }
}
