package com.exception;

/**
 * 异常处理机制语法结构
 * 介绍基本的异常处理结构和用法
 * @version 1.0.0
 * @auther ZhaoLei
 * @creatTime 2019年07月30日  15:12:37
 */
public class ExceptionStructure {

    public void method() {
        try {
            int i = 8 / 0;
        } catch (ArithmeticException | NullPointerException | IndexOutOfBoundsException e) {//jdk1.6+的写法
            e.printStackTrace();
        }
       /* try{
            int[] intArray = {1,2,3};
            intArray[3] = 4;
        }catch(RuntimeException e){
            e.printStackTrace();//堆栈打印输出，从里向外逐步输出“出错代码”的位置
        }*/
    }

    public void method2() throws RuntimeException, Exception {
    }

    public void method3() throws Exception, RuntimeException {
        String str = null;
        System.out.println("字符串长度" + str.length());
    }

    public void method4() throws RuntimeException {
        String str = null;
        System.out.println("字符串长度" + str.length());
    }


    public static void main(String[] args) {
        ExceptionStructure ste = new ExceptionStructure();
        ste.method();
        try {//Exception包含运行时异常和非运行时异常，非运行时异常要求编译时必须处理
            ste.method3();
        } catch (Exception e){
            e.printStackTrace();
        }
        ste.method4();//会继续运行到这里，因为运行时异常会被处理，程序会继续执行


        /*try {
            int i = 8;
        } catch (exception e) {
            System.out.println();
        }finally {
            System.out.println("异常执行完毕");
        }*/
    }
}
