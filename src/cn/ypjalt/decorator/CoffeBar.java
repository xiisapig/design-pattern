package cn.ypjalt.decorator;

public class CoffeBar {
    public static void main(String[] args) {
        System.out.println("~~装饰者模式~~");
        // 装饰者模式下的订单 2份巧克力 + 一份牛奶的LongBlack
        // 1. 点一份Longblack
        Drink order = new LongBlack();
        System.out.println(order.getDes() +" : "+ order.cost());

        // 2. order 加一份牛奶
        order = new Milk(order);
        System.out.println(order.getDes() +" : "+ order.cost());
        order = new Chocolatte(order);
        System.out.println(order.getDes() +" : "+ order.cost());
        order = new Chocolatte(order);
        System.out.println(order.getDes() +" : "+ order.cost());
    }
}
