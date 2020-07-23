package cn.ypjalt.bridage;

public class UpRightPhone extends Phone {
    public UpRightPhone(Brand brand) {
        super(brand);
    }
    @Override
    public void open(){
        super.open();
        System.out.println("直立手机");
    }
}
