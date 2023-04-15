package com.oxygen.adapter;

import org.junit.Test;

/**
 * 适配器模式demo
 * @author oxy
 */
public class AdapterTest {

    @Test
    public void test1(){
        PaymentService aliPayService = new AliPayService();
        PaymentService weChatPayService = new WeChatPayService();

        aliPayService.pay("1001");
        weChatPayService.pay("1002");
    }







    @Test
    public void test2(){
        PaymentService aliPayService = PayFactory.createPay("Ali");
        PaymentService weChatPayService = PayFactory.createPay("WeChat");
        PaymentService unionPay = PayFactory.createPay("Union");

        aliPayService.pay("1001");
        weChatPayService.pay("1002");
        //适配器：使用银联支付
        unionPay.pay("1003");
    }
}
