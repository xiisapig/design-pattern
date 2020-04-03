package cn.ypjalt.builder.improve;

public class Client {
    public static void main(String[] args) {
        // 盖普通房
        CommonHouse commonHouse = new CommonHouse();

        // 准备创建房子的指挥者
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        // 完成盖房子,返回产品
        House house = houseDirector.constructHouse();


        // 盖高楼
        HighBuilding highBuilding = new HighBuilding();
        houseDirector.setHouseBuilder(highBuilding);
        houseDirector.constructHouse();

    }

}
