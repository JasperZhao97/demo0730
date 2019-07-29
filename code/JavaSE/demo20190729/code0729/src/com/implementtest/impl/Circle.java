package com.implementtest.impl;

import com.implementtest.Ishape;

/**
 * 圆形的类实现接口
 * @version 1.0.0
 * @auther ZhaoLei
 * @creatTime 2019年07月29日  18:43:24
 */
public class Circle implements Ishape {

    private double r;
    private final double PI = 3.14;

    public Circle() {}

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double calculatorPerimeter() {
        return 2*r*PI;
    }

    @Override
    public double calculatorArea() {
        return r*r*PI;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getPI() {
        return PI;
    }
}
