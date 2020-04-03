package cn.ypjalt.factory.simplefactory.pizzastore.order;

import cn.ypjalt.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza2 {
    // 定义一个简单工厂对象
    Pizza pizza = null;
    String orderType = "";

    // 构造器
    public OrderPizza2() {
        // 用户输入的
        do {
            orderType = gettype();
            pizza = SimpleFactory.createPizza2(orderType);
            // 输出pizza信息
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购pizza失败");
                break;
            }
        } while (true);
    }

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
