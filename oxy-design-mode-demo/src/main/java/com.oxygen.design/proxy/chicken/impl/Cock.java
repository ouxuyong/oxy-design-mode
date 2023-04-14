package com.oxygen.design.proxy.chicken.impl;


import com.oxygen.design.proxy.chicken.Chicken;

/**
 * @author oxy
 */
public class Cock implements Chicken {


    /**
     * 公鸡的叫声
     */
    @Override
    public void call() {

        System.out.println("叽叽叽叽");
    }

    /**
     *  公鸡的行为
     */
    @Override
    public void behavior() {
        System.out.println("觅食");
    }
}
