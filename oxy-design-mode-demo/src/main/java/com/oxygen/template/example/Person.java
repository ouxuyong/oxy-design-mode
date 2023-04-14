package com.oxygen.template.example;


/**
 * 定义一个人类抽象类，表示所有人的基本行为
 */
public abstract class Person {
    // 定义一个模板方法，表示一个人的生活方式
    public final void live() {
        wakeUp();
        behavior();
        sleep();
    }
    
    // 定义一个起床方法，表示所有人起床的方式是一样的
    protected  void wakeUp(){
        System.out.println("起床..............");
    }
    
    // 定义一个抽象方法，表示每个人的行为是不同的，需要由具体子类实现
    protected abstract void behavior();
    
    // 定义一个睡觉的方法，表示所有人睡觉的方式是一样的
    protected void sleep() {
        System.out.println("睡觉中...");
    }
}