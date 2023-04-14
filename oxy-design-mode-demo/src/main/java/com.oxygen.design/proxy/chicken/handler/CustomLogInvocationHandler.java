package com.oxygen.design.proxy.chicken.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CustomLogInvocationHandler implements InvocationHandler {

    private Object target;

    public CustomLogInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long starTime = System.nanoTime();
        Object result = method.invoke(this.target, args);
        long endTime = System.nanoTime();
        System.out.println(this.target.getClass().getSimpleName()
                +method.getName()+ "方法耗时(纳秒):" + (endTime - starTime));

        return result;
    }

    public static <T> T createProxy(Object target, Class<T> targetInterface) {
        if (!targetInterface.isInterface()) {
            throw new IllegalStateException("targetInterface必须是接口类型!");
        } else if (!targetInterface.isAssignableFrom(target.getClass())) {
            throw new IllegalStateException("target必须是targetInterface接口的实现类!");
        }
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader()
                , target.getClass().getInterfaces(), new CustomLogInvocationHandler(target));

    }
}
