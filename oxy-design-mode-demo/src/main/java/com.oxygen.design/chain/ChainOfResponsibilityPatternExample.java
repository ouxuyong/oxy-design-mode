package com.oxygen.design.chain;

import org.junit.Test;

import java.util.Scanner;

/**
 * 责任链模式测试类
 *
 * @author oxy
 */
public class ChainOfResponsibilityPatternExample {




    public static void main(String[] args) {
        // 创建责任链：班主任 -> 院系主任 -> 校长
        LeaveHandler classTeacher = new ClassTeacher();
        LeaveHandler departmentHead = new DepartmentHead();
        LeaveHandler schoolPrincipal = new SchoolPrincipal();
        classTeacher.setNextHandler(departmentHead);
        departmentHead.setNextHandler(schoolPrincipal);
        while (true) {
            // 模拟学生请假请求
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入请假天数：");
            int days = scanner.nextInt();
            // 提交请假请求
            classTeacher.handleLeaveRequest(days);
        }

    }
}