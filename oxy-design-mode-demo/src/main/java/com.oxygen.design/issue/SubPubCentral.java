package com.oxygen.design.issue;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 订阅中心
 * @author oxy
 */
public class SubPubCentral {
    /**
     * 发布者map
     */
    private static Map<String, Set<String>> publisherMap = new HashMap<>();

    public boolean subscribe(Uploader publisher, Fans subscriber) {
        //拿到当前发布者的所有订阅者
        Set<String> subscriberSet = publisherMap.get(publisher.getName());
        if (subscriberSet == null) {
            //为空，之前不存在订阅者
            subscriberSet = new HashSet<>();
        }
        //添加订阅者
        boolean added = subscriberSet.add(subscriber.getName());
        if (added) {
            //添加订阅者成功。
            return publisherMap.put(publisher.getName(), subscriberSet) != null;
        }
        //订阅者添加失败或者该订阅之前则订阅了发布者
        return false;
    }

    /**
     * 取消订阅
     *
     * @param publisher
     * @param subscriber
     * @return
     */
    public boolean unsubscribe(Uploader publisher, Fans subscriber) {
        Set<String> subscriberSet = publisherMap.get(publisher.getName());
        if (subscriberSet == null) {
            return false;
        }
        //删除取消订阅者
        boolean removed = subscriberSet.remove(subscriber.getName());
        if (removed) {
            //更新订阅者列表
            publisherMap.put(publisher.getName(), subscriberSet);
        }
        return removed;

    }

    /**
     * 发布消息
     * @param publisher
     * @param message
     */
    public void publish(Uploader publisher, String message) {
        //拿到当前发布者的所有订阅者
        Set<String> subscriberSet = publisherMap.get(publisher.getName());

        //遍历订阅者发送消息。 此处简单实现： 只需要打印出拿到的所有订阅者即可
        for (String subscriber : subscriberSet) {
            System.out.println(subscriber+ " 收到: " + publisher.getName() + message);
        }
    }

}
