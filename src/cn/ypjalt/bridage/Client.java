package cn.ypjalt.bridage;

public class Client {
    public static void main(String[] args) {
        Phone phone1 = new FlodedPhone(new XiaoMi());
        phone1.open();
        phone1.call();
        phone1.close();

        Phone phone2 = new UpRightPhone(new Vivo());
        phone2.open();



    }
}
