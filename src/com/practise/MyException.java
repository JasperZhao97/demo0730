package com.practise;

/**
 * 自定义的异常处理，RunTimeException的子类
 * @version 1.0.0
 * @auther ZhaoLei
 * @creatTime 2019年07月30日  22:02:51
 */
public class MyException extends RuntimeException {

    /**
     * 构造方法，并且先调用父类的构造方法
     * @param s 异常的原因
     */
    public MyException(String s) {
        super(s);
//        System.out.println(s);
    }

    /**
     * 检查是否数量不足
     * @param quantity 仓库商品数量
     * @throws MyException
     */
    public static void checkQuantity(int quantity) throws MyException{
        if(quantity<0){
            throw new MyException("商品数量不足");
        }
    }

    /**
     * 检查商品是否存在
     * @param k 商品数组的下标
     * @throws MyException
     */
    public static void checkGoods(int k) throws MyException{
        if(k==3){
            throw new MyException("商品不存在");
        }
    }
}
