package cn.ypjalt.responsibilitychain;

public class ViceSchoolApprover extends Approver {

    public ViceSchoolApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PuchaseRequest puchaseRequest) {
        if (puchaseRequest.getPrice() <= 30000 && puchaseRequest.getPrice() >= 10000) {
            System.out.println(this.name + " I Can");
        } else {
            approver.processRequest(puchaseRequest);
        }
    }
}
