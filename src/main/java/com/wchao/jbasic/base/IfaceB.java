package com.wchao.jbasic.base;

public interface IfaceB {
    public static final int a = 0; //接口中的属性必须被初始化，且默认是public static final
    String name = "IfaceB";

    public abstract String iFun1(); // 接口中的方法默认是public abstract

    String iFun2();

    public default void iFun3(){
        System.out.println("interface default method"); //jdk1.8之后可支持接口内实现非抽象方法。用default实现，且默认是public
    }

}
