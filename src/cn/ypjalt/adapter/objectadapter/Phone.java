package cn.ypjalt.adapter.objectadapter;

public class Phone {
    // 充电
    public void charging(IVolatge5V iVolatge5V){
        if (iVolatge5V.output5V() == 5){
            System.out.println("电压为5V,可以充电");
        }else if (iVolatge5V.output5V() > 5 ){
            System.out.println("电压超过5V,停止充电");
        }
    }
}
