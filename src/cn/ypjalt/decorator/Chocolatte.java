package cn.ypjalt.decorator;

// 具体的Decorator,这里就是调味品
public class Chocolatte extends Decorator {

    public Chocolatte(Drink obj) {
        super(obj);
        setDes("巧克力");
        setPrice(3.0f); // 当前调味品价格
    }
}
