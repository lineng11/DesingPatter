package com.neng.app.activity;

import android.view.View;

import com.neng.app.bridge.LargeCoffee;
import com.neng.app.bridge.Ordinary;
import com.neng.app.bridge.SmallCoffee;
import com.neng.app.bridge.Sugar;

/**
 * 桥接模式
 * User: Created by MoMo - Neng. on
 * Data: 2016/12/24.
 */
public class BridgeActivity extends BaseActivity {

    @Override
    protected int getContentView() {
        return 0;
    }

    @Override
    protected void initCreate() {

    }

    @Override
    public void onClickButton(View view) {
        super.onClickButton(view);
        //原味
        Ordinary implOrdinary = new Ordinary();
        //加糖
        Sugar implSugar = new Sugar();

        //大杯原味
        LargeCoffee largeCoffee = new LargeCoffee(implOrdinary);
        largeCoffee.makeCoffee();

        //小杯原味
        SmallCoffee smallCoffee = new SmallCoffee(implOrdinary);
        smallCoffee.makeCoffee();

        //大杯加糖
        LargeCoffee largeCoffee1 = new LargeCoffee(implSugar);
        largeCoffee1.makeCoffee();

        //小杯加糖
        SmallCoffee smallCoffee1 = new SmallCoffee(implSugar);
        smallCoffee1.makeCoffee();

    }
}
