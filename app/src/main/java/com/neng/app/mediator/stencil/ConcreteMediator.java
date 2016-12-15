package com.neng.app.mediator.stencil;

/**
 * 具体的中介者
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/15.
 */
public class ConcreteMediator extends Mediator {


    @Override
    public void method() {
        concreteColleagueA.action();
        concreteColleagueB.action();
    }
}
