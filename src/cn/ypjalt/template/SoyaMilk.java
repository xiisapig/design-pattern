package cn.ypjalt.template;

// 抽象类,表示豆浆
public abstract class SoyaMilk {
    // 模板方法,final不让子类去覆盖
    final void make() {
        select();
        addCondiments();
        soak();
        beat();
    }

    // 选材料
    private void select() {
        System.out.println("第一步:选择好的新鲜黄豆");
    }

    // 添加不同的配料,抽象方法
    abstract void addCondiments();

    // 浸泡
    private void soak() {
        System.out.println("黄豆和配料开始浸泡");
    }

    private void beat() {
        System.out.println("黄豆和配料放入豆浆机");
    }

}
