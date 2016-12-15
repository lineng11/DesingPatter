package com.neng.app.mediator.dome;

/**
 * 抽象同事
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/15.
 */
public abstract class Colleague {

    protected Mediator mediator;  //中介对象

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

}
