package cn.ypjalt.responsibilitychain;

public class Client {
    public static void main(String[] args) {
        PuchaseRequest puchaseRequest = new PuchaseRequest(1, 200000, 1);

        DepartmentApprover departmentApprover = new DepartmentApprover("1");
        CollegeApprover collegeApprover = new CollegeApprover("2");
        ViceSchoolApprover viceSchoolApprover = new ViceSchoolApprover("3");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("4");
        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(viceSchoolApprover);
        viceSchoolApprover.setApprover(schoolMasterApprover);
        departmentApprover.processRequest(puchaseRequest);

    }
}
