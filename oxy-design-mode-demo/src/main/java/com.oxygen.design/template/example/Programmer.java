package com.oxygen.design.template.example;


/**
 * 定义一个程序员类，继承自人类抽象类
 */
public class Programmer extends Person {

    // 实现具体的行为
    @Override
    protected void behavior() {
        System.out.println("程序员在编程中...");
    }
}