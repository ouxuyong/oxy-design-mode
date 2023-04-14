package com.oxygen.design.factory.abstractfactory;

/**
 * 海尔空调产品类
 * @author oxy
 */
public class HaiErAirConditioner implements ElectricalAppliance {
    @Override
    public void turnOn() {
        System.out.println("海尔空调已打开");
    }

    @Override
    public void turnOff() {
        System.out.println("海尔空调已关闭");
    }
}
