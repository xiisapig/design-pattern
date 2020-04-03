package cn.ypjalt.flyweight;

// 具体的网站
public class ConcreteWebSite extends WebSite {

    private String type = ""; // 网站发布的形式类型

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的发布形式" + type + " "+user.getName() + "在使用");
    }
}
