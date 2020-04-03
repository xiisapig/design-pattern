package cn.ypjalt.factory.simplefactory.pizzastore.pizza;

public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给希腊pizaa准备原材料");
    }
}
