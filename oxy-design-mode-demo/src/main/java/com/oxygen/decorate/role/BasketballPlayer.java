package com.oxygen.decorate.role;

public class BasketballPlayer implements Role{
    @Override
    public String roleName() {
        return "篮球运动员";
    }

    @Override
    public String skill() {
        return "打篮球";
    }

    @Override
    public Integer ability() {
        return 100;
    }
}
