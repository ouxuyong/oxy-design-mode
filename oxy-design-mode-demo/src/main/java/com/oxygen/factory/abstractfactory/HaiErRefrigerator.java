package com.oxygen.factory.abstractfactory;

/**
 * 海尔冰箱产品类
 * @author oxy
 */
public class HaiErRefrigerator implements ElectricalAppliance {
    @Override
    public void turnOn() {
        System.out.println("海尔冰箱已打开");
    }

    @Override
    public void turnOff() {
        System.out.println("海尔冰箱已关闭");
    }
}