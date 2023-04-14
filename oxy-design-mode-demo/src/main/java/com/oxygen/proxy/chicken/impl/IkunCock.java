package com.oxygen.proxy.chicken.impl;

import com.oxygen.proxy.chicken.Chicken;

/**
 * @author oxy
 */
public class IkunCock implements Chicken {



    @Override
    public void call() {
        System.out.println("你干嘛！！！！！！");
    }

    @Override
    public void behavior() {
        System.out.println("唱、跳、rap、篮球");
    }
}
