package cn.ypjalt.principle.inversion.improve;

public class DependencyPass {
    public static void main(String[] args) {
        Sony sony = new Sony();
//        OpenAndClose openAndClose = new OpenAndClose();
//        openAndClose.open(sony);
        // 通过构造器进行传递依赖
//        OpenAndClose openAndClose = new OpenAndClose(sony);
//        openAndClose.open();
        // 通过setter进行依赖传递
        OpenAndClose op = new OpenAndClose();
        op.setTv(sony);
        op.open();
    }
}

// 方式1:通过接口传递实现依赖
/*
interface IOpenAndClose {
    public void open(ITv tv);// 抽象方法,接收接口
}


interface ITv {
    public void play();
}

class OpenAndClose implements IOpenAndClose {
    @Override
    public void open(ITv tv) {
        tv.play();
    }
}
*/


// 方式2:通过构造方法传递依赖
/*
interface IOpenAndClose {
    public void open();
}
interface ITv {
    public void play();
}
class OpenAndClose implements IOpenAndClose{
    public ITv tv;
    public OpenAndClose(ITv tv){
        this.tv = tv;
    }
    @Override
    public void open() {
        this.tv.play();
    }
}


 */

// 方式3:通过setter进行依赖传递
interface IOpenAndClose {
    public void open();
}

interface ITv {
    public void play();
}

class OpenAndClose implements IOpenAndClose {
    public ITv tv;

    public void setTv(ITv tv) {
        this.tv = tv;
    }

    @Override
    public void open() {
        this.tv.play();
    }
}

class Sony implements ITv {
    @Override
    public void play() {
        System.out.println("sony电视....打开");
    }
}