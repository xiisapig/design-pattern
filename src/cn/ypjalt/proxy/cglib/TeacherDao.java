package cn.ypjalt.proxy.cglib;

public class TeacherDao {
    public void teach() {
        System.out.println("老师授课中,我是cglib代理,不需要接口");
    }
}
