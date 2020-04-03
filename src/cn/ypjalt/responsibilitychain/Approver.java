package cn.ypjalt.responsibilitychain;

public abstract class Approver {
    Approver approver; // 下一个处理者

    String name;

    public Approver(String name) {
        this.name = name;
    }

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    public abstract void processRequest(PuchaseRequest puchaseRequest);

}
