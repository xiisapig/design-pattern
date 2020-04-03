package cn.ypjalt.builder;

public abstract class AbstractHouse {
    // 打地基
    public abstract void bulidBasic();

    // 砌墙
    public abstract void buildWalls();

    // 封顶
    public abstract void roofed();

    public void build() {
        bulidBasic();
        buildWalls();
        roofed();
    }


}
