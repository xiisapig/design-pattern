package cn.ypjalt.bridage;

// 折叠手机 继承抽象类
public class FlodedPhone extends Phone {
    public FlodedPhone(Brand brand) {
        super(brand);
    }

    public void open() {
        super.open();
        System.out.println("折叠手机开机了");
    }

    public void close() {
        super.close();
        System.out.println("折叠手机关机了");
    }

    public void call() {
        super.call();
        System.out.println("折叠手机打电话");
    }
}
