package cn.ypjalt.bridage;

public class UpRightPhone extends Phone {
    public UpRightPhone(Brand brand) {
        super(brand);
    }
    public void open(){
        super.open();
        System.out.println("直立手机");
    }




}
