package com.oxygen.adapter;

/**
 * 具体支付服务类：支付宝支付
 * @author oxy
 */
public class AliPayService implements PaymentService {
    @Override
    public void pay(String orderId) {
        System.out.println("支付宝支付：支付订单 " + orderId + " 成功！");
    }
}