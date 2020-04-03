package cn.ypjalt.command;

public class TVOnCommand implements Command{
    // 聚合LightReceiver
    TVReceive tvReceive;

    public TVOnCommand(TVReceive tvReceive) {
        this.tvReceive = tvReceive;
    }

    @Override
    public void execute() {
        // 调用接收者的方法
        tvReceive.on();
    }

    @Override
    public void undo() {
        // 调用接收者的方法
        tvReceive.off();
    }
}
