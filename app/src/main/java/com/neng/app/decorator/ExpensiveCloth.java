package com.neng.app.decorator;

import android.util.Log;

/**
 * 高档的衣服
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/20.
 */
public class ExpensiveCloth extends PersonCloth {

    public ExpensiveCloth(Person person) {
        super(person);
        Log.d(getClass().getSimpleName(), "ExpensiveCloth: 高档");
    }

    @Override
    public void dressed() {
        super.dressed();
        dressShirt();
        dressLeather();
        derssJean();
    }

    /**
     * 穿短袖
     */
    private void dressShirt() {
        Log.d(getClass().getSimpleName(), "dressShirt: 穿短袖");
    }

    /**
     * 穿皮衣
     */
    private void dressLeather() {
        Log.d(getClass().getSimpleName(), "dressLeather: 穿件皮衣");
    }

    /**
     * 穿牛仔裤
     */
    private void derssJean() {
        Log.d(getClass().getSimpleName(), "derssJean: 穿牛仔裤");
    }
}
