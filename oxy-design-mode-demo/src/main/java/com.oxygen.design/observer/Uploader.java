package com.oxygen.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * UP主
 * @author oxy
 */
public class Uploader {
    /**
     * 粉丝列表 （观察者列表）
     */
    private List<Observer> observers = new ArrayList<>();
    private String message;

    /**
     * 关注
     * @param observer
     */
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * 取关
     * @param observer
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 发布作品
     * @param message
     */
    public void sendMessage(String message) {
        this.message = message;
        notifyObservers();
    }

    /**
     * 通知粉丝
     */
    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.receive(message);
        }
    }
}