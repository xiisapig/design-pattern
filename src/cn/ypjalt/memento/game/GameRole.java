package cn.ypjalt.memento.game;

public class GameRole {
    private int vit;
    private int def;

    // 创建memento 即根据当前的状态的到memento
    public Memento createMemento() {
        return new Memento(vit, def);
    }

    public void recoverGameRoleFromMemento(Memento memento) {
        this.vit = memento.getVit();
        this.def = memento.getDef();

    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    // 显示当前游戏角色状态
    public void display() {
        System.out.println("攻击力" + this.vit + "防御力" + this.def);
    }

}
