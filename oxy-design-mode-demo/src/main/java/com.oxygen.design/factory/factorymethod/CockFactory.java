package com.oxygen.design.factory.factorymethod;


import com.oxygen.design.factory.staticfactory.Cock;
import com.oxygen.design.factory.staticfactory.Toy;

/**
 * @author oxy
 */
public class CockFactory implements ToyFactoryInterface {
    @Override
    public Toy createToy() {
        // 创建公鸡玩具对象
        return new Cock();
    }
}
