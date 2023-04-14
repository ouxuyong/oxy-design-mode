package com.oxygen.design.strategy;


import com.oxygen.design.strategy.example.ElectricAppliance;
import com.oxygen.design.strategy.example.Microwave;
import com.oxygen.design.strategy.example.WashingMachine;

/**
 * 工厂类，用于创建电器对象
 * @author oxy
 */
public class ApplianceFactory {
    public static ElectricAppliance createAppliance(String type) {
        if (type.equals("washingMachine")) {
            return new WashingMachine();
        } else if (type.equals("microwave")) {
            return new Microwave();
        } else {
            return null;
        }
    }
}