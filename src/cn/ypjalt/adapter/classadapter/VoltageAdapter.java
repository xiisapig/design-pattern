package cn.ypjalt.adapter.classadapter;

// 适配器类
public class VoltageAdapter extends Voltage220V implements IVolatge5V{
    @Override
    public int output5V() {
        int srcV = output220V();
        int dstV =  srcV / 44;
        return dstV;
    }
}
