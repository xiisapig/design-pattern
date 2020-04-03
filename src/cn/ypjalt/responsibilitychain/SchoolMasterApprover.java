package cn.ypjalt.responsibilitychain;

public class SchoolMasterApprover extends Approver {
    public SchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PuchaseRequest puchaseRequest) {
        if (puchaseRequest.getPrice() >= 30000) {
            System.out.println(this.name + " I Can");
        } else {
            approver.processRequest(puchaseRequest);
        }
    }


}
