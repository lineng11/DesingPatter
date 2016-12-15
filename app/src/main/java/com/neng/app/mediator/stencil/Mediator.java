package com.neng.app.mediator.stencil;

/**
 * 抽象的中介者
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/15.
 */
public abstract class Mediator {

    //具体同事A
    protected ConcreteColleagueA concreteColleagueA;
    //具体同事B
    protected ConcreteColleagueB concreteColleagueB;

    public void setConcreteColleagueA(ConcreteColleagueA concreteColleagueA) {
        this.concreteColleagueA = concreteColleagueA;
    }

    public void setConcreteColleagueB(ConcreteColleagueB concreteColleagueB) {
        this.concreteColleagueB = concreteColleagueB;
    }

    /**
     * 抽象中介方法
     */
    public abstract void method();
}
