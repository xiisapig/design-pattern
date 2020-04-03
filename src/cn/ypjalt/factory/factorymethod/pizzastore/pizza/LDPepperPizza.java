package cn.ypjalt.factory.factorymethod.pizzastore.pizza;

public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦胡椒pizza");
        System.out.println("伦敦胡椒pizza准备原材料");
    }
}
