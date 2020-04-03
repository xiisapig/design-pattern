package cn.ypjalt.builder.improve;

public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基5M");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通砌墙10CM");

    }

    @Override
    public void roofed() {
        System.out.println("普通房子屋顶");

    }
}
