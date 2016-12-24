package com.neng.app.bridge;

import android.util.Log;

/**
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/24.
 */
public class LargeCoffee extends Coffee {

    private String TAG = this.getClass().getSimpleName();

    public LargeCoffee(CoffeeAdditives impl) {
        super(impl);
    }

    @Override
    public void makeCoffee() {
        Log.d(TAG, "makeCoffee: 大杯 " + impl.addSomething() + " 咖啡");
    }
}
