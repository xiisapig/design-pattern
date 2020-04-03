package cn.ypjalt.principle.inversion.improve;

/**
 * DependecyInversion 依赖倒转原则
 */
public class DependecyInversion {

    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeChat());
    }
}

// 定义接口
interface IReceiver {
    public String getInfo();
}

class Email implements IReceiver{
    public String getInfo() {
        return "电子邮件信息: hello,world";
    }
}

// 增加微信
class WeChat implements IReceiver {
   public String getInfo() {
        return "微信信息: hello,world";
    }
}

// 完成Person接收消息的功能
// 方式2
class Person {
    public void receive(IReceiver receive) {
        System.out.println(receive.getInfo());
    }
}
