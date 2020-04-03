package cn.ypjalt.iterator;

import java.util.Iterator;

public class ComputerConllegeIterator implements Iterator {
    // 这里我们需要知道department是以怎样的方式存放的
    Department[] departments;
    int position = 0; // 遍历的位置
    public ComputerConllegeIterator(Department[] departments){
        this.departments = departments;
    }
    // 判断是否还有下一个
    @Override
    public boolean hasNext() {
        if (position >= departments.length || departments[position] == null){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position +=1;
        return department;
    }
    // 空实现
    public void remove(){}
}
