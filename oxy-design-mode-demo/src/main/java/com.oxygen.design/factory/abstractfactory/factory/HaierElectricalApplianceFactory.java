package com.oxygen.design.factory.abstractfactory.factory;


import com.oxygen.design.factory.abstractfactory.ElectricalAppliance;
import com.oxygen.design.factory.abstractfactory.HaiErAirConditioner;
import com.oxygen.design.factory.abstractfactory.HaiErRefrigerator;
import com.oxygen.design.factory.abstractfactory.HaiErTelevision;

/**
 * 海尔电器工厂类
 * @author oxy
 */
public class HaierElectricalApplianceFactory implements ElectricalApplianceFactory {
    /**
     * 创建海尔冰箱
     * @return
     */
    @Override
    public ElectricalAppliance createRefrigerator() {
        return new HaiErRefrigerator();
    }
    /**
     * 创建海尔空调
     * @return
     */
    @Override
    public ElectricalAppliance createAirConditioner() {
        return new HaiErAirConditioner();
    }

    /**
     * 创建海尔电视
     * @return
     */
    @Override
    public ElectricalAppliance createTelevision() {
        return new HaiErTelevision();
    }
}
