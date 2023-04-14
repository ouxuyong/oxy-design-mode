package com.oxygen.design.chain;

/**
 * 院系主任处理者
 * @author oxy
 */
public class DepartmentHead extends LeaveHandler {
    @Override
    public void handleLeaveRequest(int days) {
        if (days <= 5) {
            System.out.println("院系主任批准了请假申请，同意请假 " + days + " 天。");
        } else {
            if (nextHandler != null) {
                nextHandler.handleLeaveRequest(days);
            } else {
                System.out.println("请假天数过长，无法处理该请求。");
            }
        }
    }
}