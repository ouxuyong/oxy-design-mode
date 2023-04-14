package com.oxygen.strategy;


import com.oxygen.strategy.example.ElectricAppliance;
import com.oxygen.strategy.example.Microwave;
import com.oxygen.strategy.example.WashingMachine;
import org.junit.Test;

/**
 * 策略模式demo
 * @author oxy
 */
public class StrategyTest {

    /**
     * 策略模式
     */
    @Test
    public void strategyTest() {
        //微波炉策略
        ApplianceStrategy microwaveStrategy = new ApplianceStrategy(new Microwave());
        microwaveStrategy.use();

        //洗衣机策略
        ApplianceStrategy washingMachineStrategy = new ApplianceStrategy(new WashingMachine());
        washingMachineStrategy.use();
    }

    /**
     * 工厂模式
     */
    @Test
    public void factoryTest() {
        // 创建一个洗衣机对象
        ElectricAppliance washingMachine = ApplianceFactory.createAppliance("washingMachine");
        washingMachine.turnOn();
        washingMachine.use();
        washingMachine.turnOff();

        System.out.println("========================================");

        // 创建一个微波炉对象
        ElectricAppliance microwave = ApplianceFactory.createAppliance("microwave");
        microwave.turnOn();
        microwave.use();
        microwave.turnOff();
    }

    /**
     * 工厂模式结合策略模式
     */
    @Test
    public void combineTest() {
        // 创建一个洗衣机对象
        ElectricAppliance washingMachine = ApplianceFactory.createAppliance("washingMachine");
        // 使用洗衣机
        ApplianceStrategy washingMachineStrategy = new ApplianceStrategy(washingMachine);
        washingMachineStrategy.use();

        // 创建一个微波炉对象
        ElectricAppliance microwave = ApplianceFactory.createAppliance("microwave");
        // 使用微波炉
        ApplianceStrategy microwaveStrategy = new ApplianceStrategy(microwave);
        microwaveStrategy.use();
    }


}
