package cn.ypjalt.responsibilitychain;

import cn.ypjalt.iterator.Department;

public class DepartmentApprover extends Approver {

    public DepartmentApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PuchaseRequest puchaseRequest) {
        if (puchaseRequest.getPrice() <= 5000){
            System.out.println(this.name + " I Can");
        }else{
            approver.processRequest(puchaseRequest);
        }
    }
}
