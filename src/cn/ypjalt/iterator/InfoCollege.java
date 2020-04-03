package cn.ypjalt.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class InfoCollege implements College{
    List<Department> departmentList;

    public InfoCollege() {
        departmentList = new ArrayList<Department>();
        addDepartment("信息安全","信息安全");
        addDepartment("网络安全","网络安全");

    }

    @Override
    public String getName() {
        return "信息工程学院";
    }

    @Override
    public void addDepartment(String name, String doc) {
        Department department = new Department(name,doc);
        departmentList.add(department);
    }

    @Override
    public Iterator createIterator() {
        return new InfoColleageIterator(departmentList);
    }
}
