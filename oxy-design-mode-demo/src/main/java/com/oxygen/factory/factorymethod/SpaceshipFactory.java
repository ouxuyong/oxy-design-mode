package com.oxygen.factory.factorymethod;


import com.oxygen.factory.staticfactory.Spaceship;
import com.oxygen.factory.staticfactory.Toy;

/**
 * 定义飞船玩具工厂类
 * @author oxy
 */
public class SpaceshipFactory implements ToyFactoryInterface {
    @Override
    public Toy createToy() {
        // 创建飞船玩具对象
        return new Spaceship();
    }
}
