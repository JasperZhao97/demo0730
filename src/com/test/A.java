package com.test;

/**
 * @version 1.0.0
 * @auther ZhaoLei
 * @creatTime 2019年07月30日  11:02:59
 */
public class A {

    //成员变量
    private int i;

    //无参构造方法
    public A() {
    }

    //有参构造方法
    public A(int i) {
        this.i = i;
    }

    //类方法（静态方法）
    public void show() {
        System.out.println("最终父类是A");
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
