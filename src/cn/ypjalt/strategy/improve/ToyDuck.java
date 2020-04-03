package cn.ypjalt.strategy.improve;

import java.beans.beancontext.BeanContext;

public class ToyDuck extends Duck {

    public ToyDuck() {
        flyBehavior = new NoFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println(" 玩具鸭 ");
    }

    // 需要重写父类所有方法

}
