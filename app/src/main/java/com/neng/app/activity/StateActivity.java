package com.neng.app.activity;

import android.view.View;

import com.neng.app.state.TvController;

/**
 * 状态模式
 * User: Created by MoMo - Neng. on
 * Data: 2016/11/15.
 */
public class StateActivity extends BaseActivity {
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

        TvController tvController = new TvController();
        //打开电视
        tvController.powerOn();
        //下一个频道
        tvController.nextChannel();
        tvController.nextChannel();
        //加音量
        tvController.turnUp();
        //上一个频道
        tvController.prevChannel();
        //关机
        tvController.powerOff();
        //当前已经关键 按下了--音量(Tv是没有反映)
        tvController.turnDown();
    }
}
