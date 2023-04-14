package com.oxygen.factory.abstractfactory;

/**
 *  TCL电视产品类
 * @author oxy
 */
public class TclTelevision implements ElectricalAppliance {
    @Override
    public void turnOn() {
        System.out.println("TCL电视已打开");
    }

    @Override
    public void turnOff() {
        System.out.println("TCL电视已关闭");
    }
}
