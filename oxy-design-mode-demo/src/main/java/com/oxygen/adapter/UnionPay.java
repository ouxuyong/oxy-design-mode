package com.oxygen.adapter;

/**
 * 适配者类：银联支付
 * @author oxy
 */
public class UnionPay {
    /**
     * 使用银联支付
     * @param orderId
     */
    void payWithUnionPay(String orderId) {
        System.out.println("银联支付：支付订单 " + orderId + " 成功！");
    }
}