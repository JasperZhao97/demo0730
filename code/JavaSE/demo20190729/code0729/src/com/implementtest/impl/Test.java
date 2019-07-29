package com.implementtest.impl;

/**
 * @version 1.0.0
 * @auther ZhaoLei
 * @creatTime 2019年07月29日  19:48:59
 */
public class Test {

    public static void main(String[] args) {
        Circle circle = new Circle(6);
        System.out.println("半径为"+circle.getR()+"的圆的周长为："+circle.calculatorPerimeter());
        System.out.println("半径为"+circle.getR()+"的圆的面积为："+circle.calculatorArea());

        Rectangle rectangle = new Rectangle(5,6);
        System.out.println("长为"+rectangle.getLength()+"宽为"+rectangle.getWide()+"的矩形的周长为："+rectangle.calculatorPerimeter());
        System.out.println("长为"+rectangle.getLength()+"宽为"+rectangle.getWide()+"的矩形的面积为："+rectangle.calculatorArea());

        Delta  delta = new Delta(2,3,4);
        System.out.println("边分别为"+delta.getSide1()+","+delta.getSide2()+","+delta.getSide3()+"的三角形的周长为："+delta.calculatorPerimeter());
        System.out.println("边分别为"+delta.getSide1()+","+delta.getSide2()+","+delta.getSide3()+"的三角形的面积为："+delta.calculatorArea());
    }
}
