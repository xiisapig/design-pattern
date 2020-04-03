package cn.ypjalt.command;

public class Client {
    public static void main(String[] args) {
        // 使用命令设计模式,完成通过遥控器,对台灯的操作
        // 创建电灯的对象(接受者)
        System.out.println("使用遥控器操作灯");
        LightReceiver lightReceiver = new LightReceiver();
        // 创建电灯相关的开关命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
        // 需要一个遥控器
        RemoteController remoteController = new RemoteController();

        // 给我们的遥控器设置命令,比如no=0是电灯的开和关的操作
        remoteController.setCommand(0, lightOnCommand, lightOffCommand);

        remoteController.onButtonWasPushed(0);
        remoteController.offButtonWasPushed(0);
        remoteController.undoButtonWasPushed();

        System.out.println("使用遥控器操作电视机");
        TVReceive tvReceive = new TVReceive();

        TVOffCommand tvOffCommand = new TVOffCommand(tvReceive);
        TVOnCommand tvOnCommand = new TVOnCommand(tvReceive);
        remoteController.setCommand(1, tvOnCommand, tvOffCommand);
        // 给我们的遥控器设置命令,比如no=1是电视机的开和关的操作
        remoteController.onButtonWasPushed(1);
        remoteController.offButtonWasPushed(1);
        remoteController.undoButtonWasPushed();


    }

}
