package com.oxygen.design.factory.staticfactory;



/**
 * 定义玩具工厂类
 * @author oxy
 */
public class ToyFactory {

    /**
     * 静态方法创建不同类型的玩具对象
     * @param type
     * @return
     */
    public static Toy createToy(String type) {
        if (type.equalsIgnoreCase("robot")) {
            // 创建机器人玩具对象
            return new Robot();
        } else if (type.equalsIgnoreCase("spaceship")) {
            // 创建飞船玩具对象
            return new Spaceship();
        } else if (type.equalsIgnoreCase("dinosaur")) {
            // 创建恐龙玩具对象
            return new Dinosaur();
        }else if (type.equalsIgnoreCase("cock")) {
            // 创建公鸡玩具对象
            return new Cock();
        } else {
            // 返回空对象
            return null;
        }
    }
}
