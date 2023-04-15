package com.oxygen.adapter;

/**
 * 支付服务工厂类
 * @author oxy
 */
public class PayFactory {
    public static PaymentService createPay(String type) {
        if (type.equalsIgnoreCase("Ali")) {
            // 创建阿里支付
            return new AliPayService();
        } else if (type.equalsIgnoreCase("WeChat")) {
            // 创建微信支付
            return new WeChatPayService();
        } else if (type.equalsIgnoreCase("Union")) {
            // 创建银联支付
            UnionPay unionPay = new UnionPay();
            //创建适配器，适配银联支付
            return new UnionPayAdapter(unionPay);
        } else {
            // 返回空对象
            return null;
        }
    }
}
