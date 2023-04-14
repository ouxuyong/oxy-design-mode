package com.oxygen.factory.factorymethod;


import com.oxygen.factory.staticfactory.Cock;
import com.oxygen.factory.staticfactory.Toy;

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
