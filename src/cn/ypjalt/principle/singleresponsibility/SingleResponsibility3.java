package cn.ypjalt.principle.singleresponsibility;

/**
 * 单一职责原则
 */

public class SingleResponsibility3 {
    public static void main(String[] args) {
       Vehicle2 vehicle2 = new Vehicle2();
       vehicle2.run("宝马");
       vehicle2.runAir("飞机");
       vehicle2.runWater("轮船");
    }
}

// 方式3分析
// 1.没有对原来做大的修改,只是增加方法
// 2.这里虽然没有在类这个级别上遵守单一职责原则,但在方法上遵守了单一职责原则

class Vehicle2 {
    public void run(String vehicle) {
        System.out.println(vehicle + "在路上疾驰.....");
    }
    public void runAir(String vehicle) {
        System.out.println(vehicle + "在空中疾驰.....");
    }
    public void runWater(String vehicle) {
        System.out.println(vehicle + "在水里疾驰.....");
    }
}