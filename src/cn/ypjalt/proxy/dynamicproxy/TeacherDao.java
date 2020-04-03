package cn.ypjalt.proxy.dynamicproxy;

import cn.ypjalt.proxy.dynamicproxy.ITeacherDao;

public class TeacherDao implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println("老师正在授课中...");
    }

    public void sayHello(String name) {
        System.out.println("hello "+ name);
    }
}
