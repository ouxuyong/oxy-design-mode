package com.oxygen.decorate.beverages;

import java.math.BigDecimal;

/**
 * 红豆
 */
public class Ormosia implements Condiment{

    private MilkTea milkTea;

    public Ormosia(MilkTea milkTea) {
        this.milkTea = milkTea;
    }
    @Override
    public String getDescription() {
        return milkTea.getDescription() + ",加红豆";
    }

    @Override
    public BigDecimal cost() {
        return milkTea.cost().add(new BigDecimal(2.5));
    }
}
