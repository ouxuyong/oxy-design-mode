package com.oxygen.factory.abstractfactory.factory;

import com.oxygen.factory.abstractfactory.ElectricalAppliance;

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
