package cn.ypjalt.memento;


public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("状态1 攻击力100");
        // 保存了当前的状态
        caretaker.add(originator.saveStateMemento());

        originator.setState("状态2 攻击了80");
        caretaker.add(originator.saveStateMemento());

        originator.setState("状态3 攻击了60");
        caretaker.add(originator.saveStateMemento());


        System.out.println("当前的状态 "+originator.getState());
        // 恢复到状态1
        originator.getStateFromMemento(caretaker.get(0));
        System.out.println("恢复的状态 "+originator.getState());
    }
}
