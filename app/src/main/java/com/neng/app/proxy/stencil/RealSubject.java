package com.neng.app.proxy.stencil;

import android.util.Log;

/**
 * 具体业务
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/17.
 */
public class RealSubject extends Subject {

    @Override
    public void visit() {
        Log.d(getClass().getSimpleName(),"一个具体业务");
    }
}
