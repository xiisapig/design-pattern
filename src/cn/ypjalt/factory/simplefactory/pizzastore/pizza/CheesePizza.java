package cn.ypjalt.factory.simplefactory.pizzastore.pizza;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给制作奶酪pizza准备原材料");
    }
}
