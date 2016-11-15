package com.neng.app.activity;

import com.neng.app.singleton.Singleton;

/**
 * User: Created by MoMo - Neng. on
 * Data: 2016/11/5.
 */
public class SingletonActivity extends BaseActivity {


    @Override
    protected int getContentView() {
        return 0;
    }

    @Override
    protected void initCreate() {

        log(Singleton.getInstance().toString());

        Singleton.getInstance().setSwitch(true);

        log(Singleton.getInstance().toString());
    }
}
