package com.neng.app.bridge;

import android.util.Log;

/**
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/24.
 */
public class SmallCoffee extends Coffee {

    private String TAG = this.getClass().getSimpleName();

    public SmallCoffee(CoffeeAdditives impl) {
        super(impl);
    }

    @Override
    public void makeCoffee() {
        Log.d(TAG, "makeCoffee: 小杯 " + impl.addSomething() + "  咖啡");
    }
}
