package cn.ypjalt.strategy.improve;

public class BadFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println(" 飞不好 ");
    }
}
