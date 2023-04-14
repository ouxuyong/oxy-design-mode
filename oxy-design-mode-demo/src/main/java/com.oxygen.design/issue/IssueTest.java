package com.oxygen.design.issue;


import org.junit.Test;

/**
 * 发布订阅模式测试
 * @author oxy
 */
public class IssueTest {
    @Test
    public void test2() {
        //创建up 小欧说编程（发布者）
        Uploader uploader = new Uploader("小欧说编程");
        //创建粉丝 （订阅者）
        Fans fans1 = new Fans("光头强");
        Fans fans2 = new Fans("熊大");
        Fans fans3 = new Fans("ikun");

        //创建订阅中心
        SubPubCentral subPubCentral = new SubPubCentral();
        subPubCentral.subscribe(uploader,fans1);
        subPubCentral.subscribe(uploader,fans2);
        subPubCentral.subscribe(uploader,fans3);

        subPubCentral.publish(uploader,"发布关于“鸡你太美”视频");

        System.out.println("============ikun取关==================");
        //ikun取关
        subPubCentral.unsubscribe(uploader,fans3);

        subPubCentral.publish(uploader,"发布关于设计模式视频");


    }
}
