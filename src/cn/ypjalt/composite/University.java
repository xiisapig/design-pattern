package cn.ypjalt.composite;

import java.util.ArrayList;
import java.util.List;


public class University extends OrganizationComponent {

    List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

    public University(String name, String age) {
        super(name, age);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    protected void print() {
        System.out.println("-------" + getName() + "--------" + getDes());
        // 遍历
        for (OrganizationComponent oc : organizationComponents
        ) {
            oc.print();
        }
    }
}
