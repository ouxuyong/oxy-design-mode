package com.oxygen.decorate.beverages;

import java.math.BigDecimal;

/**
 * 珍珠
 */
public class Pearl implements Condiment{

    private MilkTea milkTea;

    public Pearl(MilkTea milkTea) {
        this.milkTea = milkTea;
    }

    @Override
    public String getDescription() {
        return milkTea.getDescription() + ",加珍珠";
    }

    @Override
    public BigDecimal cost() {
        return milkTea.cost().add(new BigDecimal(2.0));
    }
}
