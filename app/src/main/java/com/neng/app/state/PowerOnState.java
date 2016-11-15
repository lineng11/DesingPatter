package com.neng.app.state;

import android.util.Log;

/**
 * 开机状态
 * User: Created by MoMo - Neng. on
 * Data: 2016/11/15.
 */
public class PowerOnState implements TvState {

    private String Tag = this.getClass().getSimpleName();

    @Override
    public void nextChannel() {
        Log.e(Tag, "下一个频道");
    }

    @Override
    public void prevChannel() {
        Log.e(Tag, "上一个频道");
    }

    @Override
    public void turnUp() {
        Log.e(Tag, "+++音量");
    }

    @Override
    public void turnDown() {
        Log.e(Tag, "---音量");
    }
}
