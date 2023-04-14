package com.oxygen.design.factory.abstractfactory.factory;

import com.oxygen.design.factory.abstractfactory.ElectricalAppliance;

/**
 *  电器抽象工厂接口
 * @author oxy
 */
public interface ElectricalApplianceFactory {
    /**
     * 创建冰箱产品
     * @return
     */
    ElectricalAppliance createRefrigerator();

    /**
     * 创建空调产品
     * @return
     */
    ElectricalAppliance createAirConditioner();

    /**
     * 创建电视产品
     * @return
     */
    ElectricalAppliance createTelevision();


}
