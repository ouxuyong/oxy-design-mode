package com.oxygen.design.factory.staticfactory;

/**
 * 定义机器人玩具类
 * @author oxy
 */
public class Robot implements Toy {
    @Override
    public void play() {
        // 打印玩机器人玩具的操作
        System.out.println("Playing with 机器人玩具");
    }
}
