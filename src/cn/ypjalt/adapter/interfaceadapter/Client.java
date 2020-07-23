package cn.ypjalt.adapter.interfaceadapter;

public class Client {
    public static void main(String[] args) {
        System.out.println("接口适配器");
        AbsAdapter absAdapter = new AbsAdapter(){
            // 只需要去覆盖我们需要使用接口方法
            @Override
            public void m1() {
                System.out.println("使用了m1方法");
            }
        };
        absAdapter.m1();
    }
}
