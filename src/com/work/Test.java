package com.work;

/**
 * @version 1.0.0
 * @auther ZhaoLei
 * @creatTime 2019年07月30日  09:51:59
 */
public class Test {

    public static void main(String[] args) {
//        B b = new B();b.show();//可以通过子类访问父类的静态方法
        A a = new B();
        a.show();

        B b = new B();
        b.show();

        A a1 = new A();
        a1 = b;
        a1.show();

        a = (B)a;
        a.show();
    }
}
