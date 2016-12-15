package com.neng.app.mediator.stencil;

import android.util.Log;

/**
 * 具体 同事B
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/15.
 */
public class ConcreteColleagueB extends Colleague {

    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void action() {
        Log.d(this.getClass().getSimpleName(), "同事B 将信息交给了中介");
    }
}
