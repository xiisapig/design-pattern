package cn.ypjalt.responsibilitychain;

import cn.ypjalt.iterator.College;

public class CollegeApprover extends Approver {
    public CollegeApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PuchaseRequest puchaseRequest) {
        if (puchaseRequest.getPrice() >= 5000 && puchaseRequest.getPrice() <= 10000) {
            System.out.println(this.name + "I do");
        } else {
            approver.processRequest(puchaseRequest);
        }
    }
}
