package com.oxygen.adapter;

/**
 * 适配器类：银联支付的适配器
 * @author oxy
 */
public class UnionPayAdapter implements PaymentService {
    /**
     * 持有一个银联支付的实例
     */
    private UnionPay unionPay;

    public UnionPayAdapter(UnionPay unionPay) {
        this.unionPay = unionPay;
    }

    @Override
    public void pay(String orderId) {
        System.out.println("适配器：使用银联支付的适配器...");
        // 在适配器中调用银联支付的支付方法，实现适配
        unionPay.payWithUnionPay(orderId);
    }
}