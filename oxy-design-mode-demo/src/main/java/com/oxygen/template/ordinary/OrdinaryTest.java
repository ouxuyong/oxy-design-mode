package com.oxygen.template.ordinary;

import org.junit.Test;

public class OrdinaryTest {

    @Test
    public void test(){

        Programmer programmer = new Programmer();
        programmer.wakeUp();
        programmer.behavior();
        programmer.sleep();

        System.out.println("============================================================");

        Doctor doctor = new Doctor();
        doctor.wakeUp();
        doctor.behavior();
        doctor.sleep();
    }
}
