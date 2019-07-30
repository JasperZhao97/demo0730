package com.exception;

/**
 *throw的基本使用
 * @version 1.0.0
 * @auther ZhaoLei
 * @creatTime 2019年07月30日  16:47:49
 */
public class ThrowException {

    public int sum(int x,int y) throws Exception{
        if(x>10||y>10){
            throw new Exception("超出运算范围：10以内加法运算！");
        }
        return x+y;
    }

    public static void main(String[] args) {
        try {
            ThrowException te = new ThrowException();
            System.out.println("结果="+te.sum(5,5));
            System.out.println("结果="+te.sum(5,12));
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
