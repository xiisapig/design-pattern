package cn.ypjalt.factory.factorymethod.pizzastore.pizza;

public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京奶酪pizza");
        System.out.println("北京奶酪pizza准备原材料");
    }
}
