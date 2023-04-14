package com.oxygen.factory.factorymethod;

import com.oxygen.factory.staticfactory.Robot;
import com.oxygen.factory.staticfactory.Toy;


/**
 * 定义机器人玩具工厂类
 * @author oxy
 */
public class RobotFactory implements ToyFactoryInterface {
    @Override
    public Toy createToy() {
        // 创建机器人玩具对象
        return new Robot();
    }
}
