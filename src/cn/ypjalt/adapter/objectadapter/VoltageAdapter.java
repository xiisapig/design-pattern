package cn.ypjalt.adapter.objectadapter;

// 适配器类
public class VoltageAdapter implements IVolatge5V {
    // 关联关系- 聚合
    private Voltage220V voltage220V;


    // 通过构造器,传入一个Voltage220V实例
    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dst = 0;
        if (null != voltage220V) {
            int src = voltage220V.output220V();
            System.out.println("使用适配器进行适配");
            dst = src / 44;
            System.out.println("适配完成,输出电压" + dst + "V");
        }
        return dst;
    }
}
