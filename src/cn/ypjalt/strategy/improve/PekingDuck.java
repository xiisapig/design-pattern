package cn.ypjalt.strategy.improve;

public class PekingDuck extends Duck {

    public PekingDuck() {
        flyBehavior = new BadFlyBehavior();
    }


    @Override
    public void display() {
        System.out.println(" 北京鸭 ");
    }

    @Override
    public void swim() {
        System.out.println(" 北京鸭不会游泳 ");
    }
}
