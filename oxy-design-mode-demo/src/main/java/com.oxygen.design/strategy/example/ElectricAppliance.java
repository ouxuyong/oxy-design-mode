package com.oxygen.design.strategy.example;

/**
 * 电器接口
 */
public interface ElectricAppliance {
    /**
     * 打开
     */
    void turnOn();

    /**
     * 关闭
     */
    void turnOff();

    /**
     * 使用
     */
    void use();
}