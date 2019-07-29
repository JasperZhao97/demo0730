package com.implementtest.impl;

import com.implementtest.Ishape;

/**
 * 矩形的类实现接口
 * @version 1.0.0
 * @auther ZhaoLei
 * @creatTime 2019年07月29日  19:31:14
 */
public class Rectangle implements Ishape {

    /**
     * 定义的成员变量，长宽
     */
    private double length;
    private double wide;

    public Rectangle() {
    }

    public Rectangle(double length, double wide) {
        this.length = length;
        this.wide = wide;
    }

    @Override
    public double calculatorPerimeter() {
        return 2*(length+wide);
    }

    @Override
    public double calculatorArea() {
        return length*wide;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWide() {
        return wide;
    }

    public void setWide(double wide) {
        this.wide = wide;
    }
}
