package com.oxygen.factory.staticfactory;

/**
 * 定义飞船玩具类
 * @author oxy
 */
public class Spaceship implements Toy {
    @Override
    public void play() {
        // 打印玩飞船玩具的操作
        System.out.println("Playing with 宇宙飞船");
    }
}
