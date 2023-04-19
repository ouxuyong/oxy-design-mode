package com.oxygen.flyweight;

/**
 * 享元模式demo
 * @author oxy
 */
public class FlyweightTest {
    public static void main(String[] args) {
        CarMoldFactory moldFactory = new CarMoldFactory();

        // 生产不同品牌、形状、材料的汽车
        CarMold carMold1 = moldFactory.getCarMold("轿车", "钢铁");
        carMold1.produceCar("奥迪");

        CarMold carMold2 = moldFactory.getCarMold("轿车", "钢铁");
        carMold2.produceCar("宝马");

        CarMold carMold3 = moldFactory.getCarMold("SUV", "碳纤维");
        carMold3.produceCar("特斯拉");

    }
}
