package com.neng.app.proxy.dome;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理人
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/17.
 */
public class DynamicProxy implements InvocationHandler {

    private Object obj;  //被代理的类引用


    public DynamicProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //委托者对象方法
        Object result = method.invoke(obj, args);
        return result;
    }
}
