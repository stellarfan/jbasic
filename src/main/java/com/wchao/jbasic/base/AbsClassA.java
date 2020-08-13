package com.wchao.jbasic.base;

/**
 * Q：抽象类和接口有什么区别？
 * A： 1.java只能单继承多实现，所以一个实体类只可以继承一个抽象类，但可以实现多个接口
 *    2.抽象类可以有属性，抽象方法和普通方法，而接口也可以有属性但是默认是public static final的，抽象方法和普通方法（1.8之后default关键字实现）
 *    3.子类若非抽象类，则必须实现抽象类和接口的所有抽象方法
 *    4.抽象类更偏向于代码复用或流程统一，如模板模式，接口更倾向于多态性。
 */

public abstract class AbsClassA {
    int num;
    private static String str1;
    public String str2;

    private void cFun1(){
        str1 = "cfun1";
        System.out.println("fun1 is a private method");
    }

    public void cFun2(){
        str2 = "cfun2";
        System.out.println("fun2 is a public method");
    }

    /**
     * 非抽象子类必须实现该类的抽象方法
     * @return
     */
    public abstract String cFun3();
}
