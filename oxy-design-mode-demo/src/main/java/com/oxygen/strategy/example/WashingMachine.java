package com.oxygen.strategy.example;


/**
 * @author oxy
 * 洗衣机
 */
public class WashingMachine implements ElectricAppliance {
    @Override
    public void turnOn() {
        System.out.println("洗衣机开机了。");
    }

    @Override
    public void turnOff() {
        System.out.println("洗衣机关机了。");
    }

    @Override
    public void use() {
        System.out.println("洗衣机正在清洗衣服");
    }
}