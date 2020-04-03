package cn.ypjalt.principle.liskov;

public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11 -3 = " + a.fun1(11, 3));
        System.out.println("1 - 8 = " + a.fun1(1, 8));


        B b = new B();
        System.out.println("11 + 3 = " + b.fun1(11, 3));
        System.out.println("11 + 3 + 9 = " + b.fun2(11, 3));
    }

}


class A {
    public int fun1(int num1, int num2) {
        return num1 - num2;
    }
}


class B extends A {
    public int fun1(int a, int b) {
        return a + b;
    }

    public int fun2(int a, int b) {
        return fun1(a, b) + 9;
    }
}