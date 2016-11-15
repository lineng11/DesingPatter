package com.neng.app.state;

import android.util.Log;

/**
 * 关机状态
 * User: Created by MoMo - Neng. on
 * Data: 2016/11/15.
 */
public class PowerOffState implements TvState {

    private String Tag = this.getClass().getSimpleName() + " 关机状态下 Tv不操作：";

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
