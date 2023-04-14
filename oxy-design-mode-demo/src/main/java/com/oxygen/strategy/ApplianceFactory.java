package com.oxygen.strategy;


import com.oxygen.strategy.example.ElectricAppliance;
import com.oxygen.strategy.example.Microwave;
import com.oxygen.strategy.example.WashingMachine;

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