package com.neng.app.proxy.stencil;

/**
 * 代理类
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/17.
 */
public class ProxySubject extends Subject {

    //具体业务
    private RealSubject realSubject;

    public ProxySubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void visit() {
        //通过代理类进行实现
        realSubject.visit();
    }
}
