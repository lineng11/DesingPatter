package com.neng.app.decorator;

import android.util.Log;

/**
 * 屌丝衣服
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/20.
 */
public class CheapCloth extends PersonCloth {

    public CheapCloth(Person person) {
        super(person);
        Log.d(getClass().getSimpleName(), "CheapCloth: 屌丝");
    }

    @Override
    public void dressed() {
        super.dressed();
        derssShorts();
    }


    /**
     * 穿短裤
     */
    private void derssShorts() {
        Log.d(getClass().getSimpleName(), "derssShorts: 穿短裤");
    }

}
