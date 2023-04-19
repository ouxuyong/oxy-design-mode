package com.oxygen.facade;

import org.junit.Test;

/**
 * 外观测试类
 * @author oxy
 */
public class FacadeTest {

    @Test
    public void test1(){
        //引擎
        Engine engine = new Engine();
        //车门
        Door door = new Door();
        //车灯
        Light light = new Light();

        //todo 开车需要进行的步骤
        System.out.println("开车需要进行的步骤==========================");
        door.open();
        engine.start();
        light.turnOn();
        System.out.println();

        //todo 停车等相关步骤

        System.out.println("停车等相关步骤===============");
        light.turnOff();
        engine.stop();
        door.close();
    }

    @Test
    public void test2(){
        CarFacade carFacade = new CarFacade();
        System.out.println("开车需要进行的步骤==========================");
        carFacade.start();

        System.out.println();

        System.out.println("停车等相关步骤===============");
        carFacade.stop();
    }


}
