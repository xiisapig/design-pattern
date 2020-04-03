package cn.ypjalt.decorator;

public class Coffee extends Drink{

    @Override
    public float cost() {
        return getPrice();
    }
}
