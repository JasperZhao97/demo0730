package com.implementtest.impl;

import com.implementtest.Ishape;

import static java.lang.Math.sqrt;

/**
 * 三角形的类实现接口
 * @version 1.0.0
 * @auther ZhaoLei
 * @creatTime 2019年07月29日  19:36:17
 */
public class Delta implements Ishape {

    //三角形的三条边
    private double side1;
    private double side2;
    private double side3;

    public Delta() {}

    public Delta(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculatorPerimeter() {
        return side1+side2+side3;
    }

    @Override
    public double calculatorArea() {
        double p = (side1+side2+side3)/2;
        p = sqrt(p*(p-side1)*(p-side2)*(p-side3));
        return p;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
}
