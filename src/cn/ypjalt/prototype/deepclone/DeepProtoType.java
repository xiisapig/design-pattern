package cn.ypjalt.prototype.deepclone;

import java.io.*;

public class DeepProtoType implements Serializable, Cloneable {
    public String name; // sring
    public DeepCloneableTarget deepCloneableTarget; //引用类型

    public DeepProtoType() {
        super();
    }

    // 深拷贝- 方式1 使用clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        // 这里完成对基本数据类型(属性)的clone
        deep = super.clone();
        // 对引用类型的属性,进行单独处理
        DeepProtoType deepProtoType = (DeepProtoType) deep;
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
        return deepProtoType;
    }


    // 深拷贝 - 方式2 通过对象的序列化实现(推荐使用)
    public Object deepClone() {
        // 创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            // 序列化操作
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);// 当前这个对象以对象流的方式输出
            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtoType copyObj = (DeepProtoType) ois.readObject();
            return copyObj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            }catch (Exception e2){
                e2.printStackTrace();

            }
        }
    }


}
