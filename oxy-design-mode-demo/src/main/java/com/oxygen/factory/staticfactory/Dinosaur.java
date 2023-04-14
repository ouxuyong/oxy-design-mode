package com.oxygen.factory.staticfactory;

/**
 * 定义恐龙玩具类
 * @author oxy
 */
public class Dinosaur implements Toy {
    @Override
    public void play() {
        // 打印玩恐龙玩具的操作
        System.out.println("Playing with 恐龙玩具");
    }
}
