package cn.ypjalt.factory.simplefactory.pizzastore.pizza;

// 把Pizza类做成抽象
public abstract class Pizza {
    protected String name; // 名字

    public abstract void prepare(); // 准备原材料,不同的披萨不一样,因此,我们做成抽象方法

    public void bake() {
        System.out.println(name + " baking;");
    }

    public void cut() {
        System.out.println(name + " cutting;");
    }

    public void box() {
        System.out.println(name + " boxing;");
    }

    public void setName(String name) {
        this.name = name;
    }
}
