package com.oxygen.design.decorate.beverages;

import java.math.BigDecimal;

/**
 * 奶茶
 */
public interface MilkTea {
    /**
     * 奶茶名称
     * @return
     */
     String getDescription();

    /**
     * 售价
     *
     * @return
     */
    BigDecimal cost();
}
