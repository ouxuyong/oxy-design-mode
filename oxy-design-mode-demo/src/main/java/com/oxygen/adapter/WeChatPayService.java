package com.oxygen.adapter;

/**
 * 具体支付服务类：微信支付
 * @author oxy
 */
public class WeChatPayService implements PaymentService {
    @Override
    public void pay(String orderId) {
        System.out.println("微信支付：支付订单 " + orderId + " 成功！");
    }
}