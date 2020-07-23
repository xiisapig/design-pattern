package cn.ypjalt.composite;

public class Client {
    public static void main(String[] args) {
        // 从大到小创建对象 学校
        OrganizationComponent university = new University("清华大学", "中国第一大学");
        // 创建学院
        OrganizationComponent college1 = new College("计算机学院", "计算机学院666");
        OrganizationComponent college2 = new College("信息工程学院", "信息工程学院不错");

        // 创建各个学研下面的系(专业)
        college1.add(new Department("软件工程", "软件工程不错"));
        college1.add(new Department("网络工程", "网络工程不错"));
        college1.add(new Department("计算机科学与技术", "计算机科学与技术老牌"));

        college2.add(new Department("通信工程", "txgc"));
        college2.add(new Department("信息工程", "xxgc"));

        // 将两个学院加入到学校中
        university.add(college1);
        university.add(college2);
        university.print();
    }
}
