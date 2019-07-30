package com.practise;

/**
 * @version 1.0.0
 * @auther ZhaoLei
 * @creatTime 2019年07月30日  21:29:24
 */
public class Service {

    /**
     * 初始化数组
     */
    Store[] stores = {
            new Store("牛奶", 5),
            new Store("巧克力", 3),
            new Store("包子", 1)};


    /**
     * 购买东西的方法
     * @param name 购买的商品名称
     * @param i     购买的商品数量
     */
    public void buy(String name, int i) {
        for (int j = 0; j <= 3; j++) {
            if (j!=3&&name.equals(stores[j].getName())) {
                try {
                    int b = stores[j].getQuantity();
                    b = b - i;
                    MyException.checkQuantity(b);
                } catch (MyException e) {
                    e.printStackTrace();
                }
                break;
            } else if (j == 3) {
                try {
                    int k = j;
                    MyException.checkGoods(k);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                }
            }
        }
    }
}
