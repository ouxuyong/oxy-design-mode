package com.oxygen.design.strategy;


import com.oxygen.design.strategy.example.ElectricAppliance;

/**
 * 策略类，用于执行电器操作
 * @author oxy
 */
public class ApplianceStrategy {
    private ElectricAppliance appliance;

    public ApplianceStrategy(ElectricAppliance appliance) {
        this.appliance = appliance;
    }

    public void use() {
        appliance.turnOn();
        appliance.use();
        appliance.turnOff();
        System.out.println("=============================================");
    }
}