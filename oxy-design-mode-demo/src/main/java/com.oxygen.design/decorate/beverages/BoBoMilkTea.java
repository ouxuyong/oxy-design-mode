package com.oxygen.design.decorate.beverages;

import java.math.BigDecimal;

/**
 * 波波奶茶
 */
public class BoBoMilkTea implements MilkTea {
    @Override
    public String getDescription() {
        return "波波奶茶";
    }

    @Override
    public BigDecimal cost() {
        return new BigDecimal(8.0);
    }
}
