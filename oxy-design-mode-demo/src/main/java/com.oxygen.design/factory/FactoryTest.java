package com.oxygen.design.factory;



import com.oxygen.design.factory.abstractfactory.ElectricalAppliance;
import com.oxygen.design.factory.abstractfactory.factory.ElectricalApplianceFactory;
import com.oxygen.design.factory.abstractfactory.factory.HaierElectricalApplianceFactory;
import com.oxygen.design.factory.abstractfactory.factory.TclelectricalApplianceFactory;
import com.oxygen.design.factory.factorymethod.CockFactory;
import com.oxygen.design.factory.factorymethod.DinosaurFactory;
import com.oxygen.design.factory.factorymethod.RobotFactory;
import com.oxygen.design.factory.factorymethod.SpaceshipFactory;
import com.oxygen.design.factory.factorymethod.ToyFactoryInterface;

import com.oxygen.design.factory.staticfactory.Cock;
import com.oxygen.design.factory.staticfactory.Dinosaur;
import com.oxygen.design.factory.staticfactory.Robot;
import com.oxygen.design.factory.staticfactory.Spaceship;
import com.oxygen.design.factory.staticfactory.Toy;
import com.oxygen.design.factory.staticfactory.ToyFactory;
import org.junit.Test;

/**
 * @author oxy
 */
public class FactoryTest {

    @Test
    public void common(){
        //恐龙玩具
        Toy dinosaur = new Dinosaur();
        dinosaur.play();

        //机器人玩具
        Toy robot = new Robot();
        robot.play();

        //飞船玩具
        Toy spaceship = new Spaceship();
        spaceship.play();

        //公鸡玩具
        Toy cock = new Cock();
        cock.play();
    }

    /**
     * 静态工厂
     */
    @Test
    public void staticFactory(){
        // 通过静态方法创建机器人玩具对象
        Toy robot = ToyFactory.createToy("robot");
        // Playing with robot，打印玩机器人玩具的操作
        robot.play();

        // 通过静态方法创建飞船玩具对象
        Toy spaceship = ToyFactory.createToy("spaceship");
        // Playing with spaceship，打印玩飞船玩具的操作
        spaceship.play();

        // 通过静态方法创建恐龙玩具对象
        Toy dinosaur = ToyFactory.createToy("dinosaur");
        // Playing with dinosaur，打印玩恐龙玩具的操作
        dinosaur.play();

        // 通过静态方法创建公鸡玩具对象
        Toy cock = ToyFactory.createToy("cock");
        // Playing with cock，打印玩公鸡玩具的操作
        cock.play();
    }

    /**
     * 工厂方法
     */
    @Test
    public void factoryMethod(){
        ToyFactoryInterface robotFactory = new RobotFactory();
        Toy robot = robotFactory.createToy();
        robot.play(); // Playing with 机器人

        ToyFactoryInterface spaceshipFactory = new SpaceshipFactory();
        Toy spaceship = spaceshipFactory.createToy();
        spaceship.play(); // Playing with 飞船

        ToyFactoryInterface dinosaurFactory = new DinosaurFactory();
        Toy dinosaur = dinosaurFactory.createToy();
        dinosaur.play(); //恐龙

        ToyFactoryInterface cockFactory = new CockFactory();
        Toy cock = cockFactory.createToy();
        cock.play(); //公鸡

    }

    /**
     * 抽象工厂
     */
    @Test
    public void abstractFactory(){
        // 创建海尔电器工厂对象
        ElectricalApplianceFactory haierFactory = new HaierElectricalApplianceFactory();
        // 创建海尔冰箱、空调、电视
        ElectricalAppliance refrigerator = haierFactory.createRefrigerator();
        ElectricalAppliance airConditioner = haierFactory.createAirConditioner();
        ElectricalAppliance television = haierFactory.createTelevision();
        // 打开海尔冰箱、空调、电视
        refrigerator.turnOn();
        airConditioner.turnOn();
        television.turnOn();
        System.out.println("=========================海尔==============================================");
        // 关闭海尔冰箱、空调、电视
        refrigerator.turnOff();
        airConditioner.turnOff();
        television.turnOff();

        System.out.println("=========================品牌分界线==============================================");

        // 创建TCL电器工厂对象
        ElectricalApplianceFactory tclFactory = new TclelectricalApplianceFactory();
        // 创建TCL冰箱、空调、电视
        ElectricalAppliance tclRefrigerator = tclFactory.createRefrigerator();
        ElectricalAppliance tclAirConditioner = tclFactory.createAirConditioner();
        ElectricalAppliance tclTelevision = tclFactory.createTelevision();
        // 打开TCL冰箱、空调、电视
        tclRefrigerator.turnOn();
        tclAirConditioner.turnOn();
        tclTelevision.turnOn();
        System.out.println("=========================TCL==============================================");

        // 关闭TCL冰箱、空调、电视
        tclRefrigerator.turnOff();
        tclAirConditioner.turnOff();
        tclTelevision.turnOff();
    }


}
