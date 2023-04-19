package com.oxygen.flyweight;

/**
 * 汽车模具类，包含模具的参数信息
 * @author oxy
 */
public class CarMold {
    /**
     * 模具的形状
     */
    private String shape;
    /**
     * 模具的材料
     */
    private String material;

    /**
     * 生成汽车
     * @param brand
     */
    public void produceCar(String brand) {
        System.out.println("生产一辆 " + brand + " 品牌的汽车，模具形状：" + shape + "，模具材料：" + material);
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

}