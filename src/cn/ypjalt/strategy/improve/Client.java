package cn.ypjalt.strategy.improve;

public class Client {
    public static void main(String[] args) {
        System.out.println("~~策略模式~~");
        WildDuck wildDuck = new WildDuck();
        wildDuck.fly();

        ToyDuck toyDuck = new ToyDuck();
        toyDuck.fly();

        PekingDuck pekingDuck = new PekingDuck();
        pekingDuck.fly();

        // 动态改变某个对象的行为
        FlyBehavior flyBehavior = new GoodFlyBehavior();
        pekingDuck.setFlyBehavior(flyBehavior);
        pekingDuck.fly();
    }
}
