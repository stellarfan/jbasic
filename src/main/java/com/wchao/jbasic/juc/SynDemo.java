package com.wchao.jbasic.juc;

public class SynDemo {
    public  String str; // synchronized不能修饰类和属性
    /*
        synchronized修饰静态方法
        作用范围：整个类
     */
    public synchronized static void fun1(){
        // TODO
    }

    /*
        synchronized修饰普通方法
        作用范围：一个实例对象
     */
    public synchronized void fun2(){
        // TODO
    }

    /*
         synchronized修饰代码块
         作用范围：指定代码块
     */
    public String fun3(){
        String name = "fun3";
        synchronized (this){
            //todo
        }
        return name;
    }
}
