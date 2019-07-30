package com.practise;

/**
 * 验证try、catch、finally的用法
 * 异常的基础练习
 * @version 1.0.0
 * @auther ZhaoLei
 * @creatTime 2019年07月30日  19:12:26
 */
public class ExceptionBase {

    /**
     * 验证数学异常
     */
    public void method1() {
        try {
            int i = 8 / 0;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("数学异常");
        }
    }

    /**
     * 空指针异常
     */
    public void method2() {
        try {
            String b = null;
            System.out.println("数组的长度为：" + b.length());
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("空指针异常");
        }

    }

    /**
     * 数字格式异常
     */
    public void method3() {
        try {
            /*char a = '\u4f60';
             int b = a;*/
            //将字符串“it”转换为Integer类型，会报错
            System.out.println(Integer.parseInt("it"));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("数字类型异常");
        }
    }

    /**
     * 索引越界异常
     */
    public void method4() {
        try {
            int[] a = {1, 2, 3};
            System.out.println("索引下标为3的数组为：" + a[3]);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("索引越界异常");
        }
    }

    /**
     * 类型转换异常
     */
    public void method5() {
        try {
            //java中由Object类型转换为int类型时，不能直接转换，而应该先将Object类型转换成String类型，然后将String类型转换成int类型
            Object value = null;
            Integer.parseInt(String.valueOf(value));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("类型转换异常");
        }
    }

    public static void main(String[] args) {
        ExceptionBase eb = new ExceptionBase();
        eb.method1();
        eb.method2();
        eb.method3();
        eb.method4();
        eb.method5();
    }
}
