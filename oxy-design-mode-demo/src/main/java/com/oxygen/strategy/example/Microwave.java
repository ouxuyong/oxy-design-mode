package com.oxygen.strategy.example;

/**
 * 微波炉
 * @author oxy
 */
public class Microwave implements ElectricAppliance {
    @Override
    public void turnOn() {
        System.out.println("微波炉打开了。");
    }

    @Override
    public void turnOff() {
        System.out.println("微波炉关闭了。");
    }

    @Override
    public void use() {
        System.out.println("微波炉正在加热食物。");
    }
}