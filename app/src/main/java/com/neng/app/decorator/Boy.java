package com.neng.app.decorator;

import android.util.Log;

/**
 * 具体人的实现
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/20.
 */
public class Boy extends Person {

    @Override
    public void dressed() {
        Log.d(getClass().getSimpleName(),"穿了内衣");
    }
}
