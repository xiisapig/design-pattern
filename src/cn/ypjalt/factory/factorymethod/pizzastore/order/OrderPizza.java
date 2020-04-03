package cn.ypjalt.factory.factorymethod.pizzastore.order;

import cn.ypjalt.factory.factorymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class OrderPizza {
    // 构造器
    public OrderPizza() {
        Pizza pizza = null;
        String orderType; // 订购pizza类型
        do {
            orderType = gettype();
            pizza = createPizza(orderType); // 抽象方法,由工厂子类完成
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();


        } while (true);
    }

    // 定义一个抽象方法,createPizza,让各个工厂子类自己实现
    abstract Pizza createPizza(String orderType);

    // 写一个方法,可以获取用户希望订购的披萨种类

    private String gettype() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
