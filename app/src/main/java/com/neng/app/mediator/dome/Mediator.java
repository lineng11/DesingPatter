package com.neng.app.mediator.dome;

/**
 * 抽象的中介者
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/15.
 */
public abstract class Mediator {


    /**
     * 抽象中介方法
     */
    public abstract void changed(Colleague colleague);
}
