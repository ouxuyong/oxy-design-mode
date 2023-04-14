package com.oxygen.design.factory.abstractfactory;

/**
 *  TCL冰箱产品类
 * @author oxy
 */
public class TclErRefrigerator implements ElectricalAppliance {
    @Override
    public void turnOn() {
        System.out.println("TCL冰箱已打开");
    }

    @Override
    public void turnOff() {
        System.out.println("TCL冰箱已关闭");
    }
}