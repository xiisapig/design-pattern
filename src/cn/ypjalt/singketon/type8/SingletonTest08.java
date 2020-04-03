package cn.ypjalt.singketon.type8;

public class SingletonTest08 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.INSTANCE;
        Singleton singleton2 = Singleton.INSTANCE;
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
        singleton1.sayOK();
    }
}

// 使用枚举,可以实现单例,推荐使用
enum Singleton {
    INSTANCE;//属性

    public void sayOK() {
        System.out.println("OK");
    }
}
