package com.neng.app.mediator.stencil;

import android.util.Log;

/**
 * 具体 同事A
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/15.
 */
public class ConcreteColleagueA extends Colleague {

    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void action() {
        Log.d(this.getClass().getSimpleName(),"同事A 将信息交给了中介");
    }
}
