package cn.ypjalt.principle.liskov.improve;

public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11 -3 = " + a.fun1(11, 3));
        System.out.println("1 - 8 = " + a.fun1(1, 8));


        B b = new B();
        System.out.println("11 + 3 = " + b.fun1(11, 3));
        System.out.println("11 + 3 + 9 = " + b.fun2(11, 3));

        // 使用组合仍然使用A类的方法
        System.out.println("11 - 3 = " + b.fun3(11, 3));
    }

}

// 创建一个更加基础的基类
class Base {
    // 把更加基础的方法和成员写到Base类
}


class A extends Base {
    public int fun1(int num1, int num2) {
        return num1 - num2;
    }
}


class B extends Base {
    // 如果B类需要用到A的方法,使用组合关系
    private A a = new A();

    public int fun1(int a, int b) {
        return a + b;
    }

    public int fun2(int a, int b) {
        return fun1(a, b) + 9;
    }

    public int fun3(int a, int b) {
        return this.a.fun1(a, b);
    }

}