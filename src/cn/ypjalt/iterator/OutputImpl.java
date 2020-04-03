package cn.ypjalt.iterator;

import java.util.Iterator;
import java.util.List;

public class OutputImpl {
    // 学院集合
    List<College> collegeList;

    public OutputImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    public void printCollege() {
        // 从collegeList取出所有学院,java中的list已经实现iterator
        Iterator<College> iterator = collegeList.iterator();
        while (iterator.hasNext()){
            // 取出一个学院
            College college = iterator.next();
            System.out.println(college.getName());
            printDepartment(college.createIterator());
        }
    }


    // 输出学院输出系
    public void printDepartment(Iterator iterator) {
        while (iterator.hasNext()) {
            Department d = (Department) iterator.next();
            System.out.println(d.getName());
        }
    }
}
