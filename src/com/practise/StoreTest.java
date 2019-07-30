package com.practise;

/**
 * 测试类
 * @version 1.0.0
 * @auther ZhaoLei
 * @creatTime 2019年07月30日  20:05:40
 */
public class StoreTest {

    public static void main(String[] args) {

        //创建的新的服务对象
        Service service = new Service();
        //购买3个包子
        service.buy("包子",3);
        //购买一个冰淇淋
        service.buy("冰淇淋",1);
    }
}
