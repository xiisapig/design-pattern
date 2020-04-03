package cn.ypjalt.command;


// 创建命令接口
public interface Command {
    // 执行某个动作
    void execute();
    // 撤销动作
    void undo();
}
