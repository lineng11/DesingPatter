package com.neng.app.state;

import android.util.Log;

/**
 * User: Created by MoMo - Neng. on
 * Data: 2016/11/15.
 */
public class TvController implements PoweController {

    private String Tag = this.getClass().getSimpleName();

    private TvState tvState;

    /**
     * 设置电视 状态
     *
     * @param tvState PowerOnState 开 /  PowerOffState 关
     */
    private void setTvState(TvState tvState) {
        this.tvState = tvState;
    }

    @Override
    public void powerOn() {
        setTvState(new PowerOnState());
        Log.e(Tag, "开机了");
    }

    @Override
    public void powerOff() {
        setTvState(new PowerOffState());
        Log.e(Tag, "关机了");
    }

    /**
     * 下一个频道
     */
    public void nextChannel() {
        tvState.nextChannel();
    }

    /**
     * 上一个频道
     */
    public void prevChannel() {
        tvState.prevChannel();
    }

    /**
     * +++音量
     */
    public void turnUp() {
        tvState.turnUp();
    }

    /**
     * ---音量
     */
    public void turnDown() {
        tvState.turnDown();
    }

}
