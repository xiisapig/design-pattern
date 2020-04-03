package cn.ypjalt.strategy.improve;

public class WildDuck extends Duck {
    // 构造器传入FlyBehavior

    public WildDuck() {
        flyBehavior = new GoodFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("这是野鸭");
    }
}
