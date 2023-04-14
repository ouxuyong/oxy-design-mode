package com.oxygen.factory.factorymethod;


import com.oxygen.factory.staticfactory.Dinosaur;
import com.oxygen.factory.staticfactory.Toy;

/**
 * @author oxy
 */
public class DinosaurFactory implements ToyFactoryInterface {
    @Override
    public Toy createToy() {
        // 创建恐龙玩具对象
        return new Dinosaur();
    }
}
