package com.neng.app.facade;

import android.util.Log;

/**
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/22.
 */
public class PhoneImpl implements Phone {

    private String TAG = this.getClass().getSimpleName();
    
    @Override
    public void dail() {
        Log.d(TAG, "dail: 打电话");
    }

    @Override
    public void hangup() {
        Log.d(TAG, "hangup: 挂断");
    }
}
