package com.oxygen.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 汽车模具享元工厂类
 * @author oxy
 */
public class CarMoldFactory {
    /**
     *  汽车模具对象的缓存
     */
    private Map<String, CarMold> carMolds = new ConcurrentHashMap<>();


    /**
     * 获取汽车模具对象
     * @param shape
     * @param material
     * @return
     */
    public CarMold getCarMold(String shape, String material) {
        // 生成缓存的键值
        String key = shape + "_" + material;
        // 从缓存中获取模具对象
        CarMold carMold = carMolds.get(key);

        // 如果缓存中没有对应的模具对象，则创建新的模具对象并放入缓存
        if (carMold == null) {
            carMold = new CarMold();
            carMold.setShape(shape);
            carMold.setMaterial(material);
            carMolds.put(key, carMold);
        }

        return carMold;
    }
}