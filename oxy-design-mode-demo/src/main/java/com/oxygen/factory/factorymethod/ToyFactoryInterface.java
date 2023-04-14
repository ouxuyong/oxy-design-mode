package com.oxygen.factory.factorymethod;

import com.oxygen.factory.staticfactory.Toy;


/**
 * 定义玩具工厂接口
 * @author oxy
 */
public interface ToyFactoryInterface {
    /**
     * 定义创建玩具的方法
     * @return
     */
    Toy createToy();
}