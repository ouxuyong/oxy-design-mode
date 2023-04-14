package com.oxygen.design.template;


import com.oxygen.design.template.example.BasketballFan;
import com.oxygen.design.template.example.Doctor;
import com.oxygen.design.template.example.Person;
import com.oxygen.design.template.example.Programmer;
import org.junit.Test;

/**
 * 模板方法模式（Template Method Pattern）是一种行为型设计模式，
 * 它定义了一个操作中的算法框架，将一些步骤延迟到子类中实现。
 * 模板方法模式使得子类可以不改变一个算法的结构即可重新定义该算法的某些特定步骤。
 */
public class TemplateTest {

    @Test
    public void templateTest(){
        // 创建一个程序员对象，调用模板方法，看看程序员的生活方式
        Person programmer = new Programmer();
        programmer.live();
        System.out.println("==============================================");
        // 创建一个医生对象，调用模板方法，看看医生的生活方式
        Person doctor = new Doctor();
        doctor.live();
        System.out.println("==============================================");
        // 创建一个篮球爱好者对象，调用模板方法，看看篮球爱好者的生活方式
        Person basketballFan = new BasketballFan();
        basketballFan.live();
    }
}
