package com.practise;

/**
 * 商店类
 * 存储商品信息
 * @version 1.0.0
 * @auther ZhaoLei
 * @creatTime 2019年07月30日  20:04:51
 */
public class Store {

    /**
     * 商品的名字，商品的数量
     */
    private String name;
    private int quantity;

    public Store() {
    }

    public Store(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
