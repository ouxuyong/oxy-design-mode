package com.oxygen.factory.staticfactory;
/**
 * 定义公鸡玩具类
 * @author oxy
 */
public class Cock implements Toy{
    @Override
    public void play() {
        // 打印玩公鸡玩具的操作
        System.out.println("你干嘛！！！！！");
    }
}
