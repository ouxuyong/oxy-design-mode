package com.oxygen.adapter;

/**
 * 目标接口：支付服务
 * @author oxy
 */
public interface PaymentService {
    /**
     * 支付订单的方法
     * @param orderId
     */
    void pay(String orderId);
}