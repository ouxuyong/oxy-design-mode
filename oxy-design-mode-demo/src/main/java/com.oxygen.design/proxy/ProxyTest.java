package com.oxygen.design.proxy;


import com.oxygen.design.proxy.chicken.Chicken;
import com.oxygen.design.proxy.chicken.handler.ChickenProxy;
import com.oxygen.design.proxy.chicken.handler.CustomLogInvocationHandler;
import com.oxygen.design.proxy.chicken.impl.Cock;
import com.oxygen.design.proxy.chicken.impl.IkunCock;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyTest {


    @Test
    public void test1(){
        //todo 公鸡
        Chicken cock = new Cock();
        //公鸡叫声
        cock.call();
        //公鸡的行为
        cock.behavior();
        System.out.println("=============================================================");

        //todo 其他种类公鸡
        Chicken ikun = new IkunCock();
        ikun.call();
        ikun.behavior();
    }


    /**
     * 增加日志代理类
     */
    @Test
    public void test2(){
        //todo 公鸡
        Chicken cock = new ChickenProxy(new Cock());
        //公鸡叫声
        cock.call();
        //公鸡的行为
        cock.behavior();
        System.out.println("=============================================================");

        //todo 其他种类公鸡
        Chicken ikun = new ChickenProxy(new IkunCock());
        ikun.call();
        ikun.behavior();
    }

    /**
     * 使用Proxy完成代理模式
     */
    @Test
    public void test4(){
        //todo 公鸡
        Chicken cock = CustomLogInvocationHandler.createProxy(new Cock(), Chicken.class);
        cock.call();
        cock.behavior();
        System.out.println("=============================================================");

        //todo 其他种类公鸡
        Chicken ikun = CustomLogInvocationHandler.createProxy(new IkunCock(), Chicken.class);
        ikun.call();
        ikun.behavior();
    }









    @Test
    public void test() throws Exception{
        InvocationHandler invocationHandler =  (proxy, method, args) ->  {
            System.out.println(" 我是InvocationHandler，被调用的方法是：" + method.getName() );
            return null;
        };


        Chicken chicken = (Chicken) Proxy.newProxyInstance(Cock.class.getClassLoader(),new Class[]{Chicken.class}, invocationHandler);

        chicken.call();
    }



}
