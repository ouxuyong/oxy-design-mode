package com.oxygen.design.template.example;


/**
 * 定义一个医生类，继承自人类抽象类
 */
public class Doctor extends Person {
    
    // 实现具体的行为
    @Override
    protected void behavior() {
        System.out.println("医生在看病中...");
    }
}