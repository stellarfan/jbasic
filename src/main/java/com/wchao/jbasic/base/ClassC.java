package com.wchao.jbasic.base;

public class ClassC extends AbsClassA implements IfaceB{
    @Override
    public String cFun3() {
        return null; // 子类若不是抽象类，必须实现父抽象类的所有抽象方法
    }

    @Override
    public String iFun1() {
        return "myFun1"; // 必须实现接口的所有抽象方法
    }

    @Override
    public String iFun2() {
        return "myFun2";
    }

    @Override
    public void iFun3() {
        return; // 接口的default方法可重写也可不重写
    }
}
