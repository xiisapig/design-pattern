package cn.ypjalt.iterator;

import java.util.Iterator;

public class ComputerCollege implements College {

    Department[] departments;
    int numOfDepartment = 0; // 保存当前数组的对象个数


    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("JAVA","JAVA专业1");
        addDepartment("PHP","PHP专业1");
        addDepartment("PY","PY专业1");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String doc) {
        Department department = new Department(name, doc);
        departments[numOfDepartment] = department;
        numOfDepartment++;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerConllegeIterator(departments);
    }
}
