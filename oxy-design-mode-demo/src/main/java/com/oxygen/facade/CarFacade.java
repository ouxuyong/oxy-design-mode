package com.oxygen.facade;

/**
 * 外观类
 * @author oxy
 */
public class CarFacade {
    /**
     * 引擎
     */
    private Engine engine;
    /**
     * 车门
     */
    private Door door;
    /**
     * 车灯
     */
    private Light light;
    
    public CarFacade() {
        engine = new Engine();
        door = new Door();
        light = new Light();
    }

    /**
     *  打开车门，启动车辆引擎，打开车灯
     *
     */
    public void start() {
        door.open();
        engine.start();
        light.turnOn();
    }

    /**
     * 关闭车灯，关闭引擎，关闭车门
     */
    public void stop() {
        light.turnOff();
        engine.stop();
        door.close();
    }
}