package cn.ypjalt.prototype.deepclone;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtoType p = new DeepProtoType();
        p.name = "tom";
        p.deepCloneableTarget = new DeepCloneableTarget("大牛","大牛的类");
        // 方式1 进行深拷贝
//        DeepProtoType p2 = (DeepProtoType) p.clone();
//        System.out.println(p.hashCode());
//        System.out.println(p2.hashCode());
        // 方式2 完成深拷贝

        DeepProtoType p2 = (DeepProtoType) p.deepClone();
        System.out.println(p.hashCode());
        System.out.println(p2.hashCode());

    }
}
