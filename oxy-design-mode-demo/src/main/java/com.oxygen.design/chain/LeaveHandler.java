package com.oxygen.design.chain;

/**
 * 抽象请假处理者
 * @author oxy
 */
public abstract class LeaveHandler {
    /**
     * 下一个处理者
     */
    protected LeaveHandler nextHandler;

    public void setNextHandler(LeaveHandler handler) {
        this.nextHandler = handler;
    }

    /**
     * 处理请假请求
     * @param days
     */
    public abstract void handleLeaveRequest(int days);
}