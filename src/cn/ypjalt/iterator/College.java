package cn.ypjalt.iterator;

import java.util.Iterator;

public interface College {
    public String getName();
    // 增加系的方法
    public void addDepartment(String name,String doc);
    // 返回一个迭代器,遍历
    public Iterator createIterator();
}
