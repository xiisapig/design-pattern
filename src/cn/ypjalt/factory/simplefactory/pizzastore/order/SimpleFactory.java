package cn.ypjalt.factory.simplefactory.pizzastore.order;

import cn.ypjalt.factory.simplefactory.pizzastore.pizza.CheesePizza;
import cn.ypjalt.factory.simplefactory.pizzastore.pizza.GreekPizza;
import cn.ypjalt.factory.simplefactory.pizzastore.pizza.PepperPizza;
import cn.ypjalt.factory.simplefactory.pizzastore.pizza.Pizza;

// 简单工厂类
public class SimpleFactory {
    // 根据orderType返回对应的Pizza对象
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if (orderType.equals("Cheese")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }
    // 简单工厂 静态工厂模式
    public static Pizza createPizza2(String orderType) {
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if (orderType.equals("Cheese")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }
}
